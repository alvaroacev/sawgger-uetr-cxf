package com.uetr.function;

import java.util.UUID;

public class UETR {
	
	public String generateUETR() {
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        return randomUUIDString;
	}
	
	public static void main(String[] args) {
		UETR uetr = new UETR();
        String uuid = uetr.generateUETR();
        System.out.println("uuid = " + uuid);
    }
}
