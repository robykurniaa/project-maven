package com.juaracoding.Junit;

import static org.junit.Assert.*;

import org.junit.Test;
import com.juaracoding.Junit.siswa.Siswa;

public class TestSiswa {
	String expect_nama = "koswara";
	Siswa siswa = new Siswa(expect_nama); 
	@Test
	public void testTampilkandata() {
		assertEquals(expect_nama, siswa.tampilkandata());
	}

}
