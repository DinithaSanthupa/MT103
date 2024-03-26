package com.cbc.bank;
import com.prowidesoftware.swift.model.field.Field20;
import com.prowidesoftware.swift.model.field.Field23B;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mt103Application {
	
	
    private static final Logger logger = LoggerFactory.getLogger(Mt103Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Mt103Application.class, args);
        
    
       /*
        * 
        *   
         String mt103Message = "{1:F01BANKDEFFXXXX0000000000}{2:I103BANKDEFFXXXXN}{4:\n" +
                ":20:TRV/TT/14/24300\n" +
                ":23B:CRED\n" +
                ":32A:210107USD1000,00\n" +
                ":33B:USD1000,00\n" +
                ":50K:/12345678901234567890\n" +
                "JOHN DOE\n" +
                "123 MAIN STREET\n" +
                "ANYTOWN, USA\n" +
                ":59:/09876543210987654321\n" +
                "JANE SMITH\n" +
                "456 PARK AVENUE\n" +
                "ANYCITY, USA\n" +
                ":70:Payment for invoice 123456\n" +
                ":71A:OUR\n" +
               "-}";
         
         String fin = "{1:F01CCEYLKLXA0010000000000}{2:O1030123456789CCEYLKLXX001N}{4:\n"
         		+ ":20:TRV/TT/14/24300\n"
         		+ ":23B:CRED\n"
         		+ ":32A:140902USD4166,25\n"
         		+ ":50K:/1030016666\n"
         		+ "WINDFORCE (PVT) LTD NO 334 T B JAYAH MAWATHA COLOMBO 10 SRI LANKA\n"
         		+ ":56A:CHASUS33XXX\n"
         		+ ":57A:SCBLUS33XXX\n"
         		+ ":59:/04252430000088 SHETHIA ERECTORS AND MATERIAL HANDLERS LTD 7/8/9/10 B.P.S ANANDA BEHIND AKESHA COLLECTION OFF P.K ROAD MULUND\n"
         		+ ":70:7880-OPERATION AND MAINTENANCE CHARGE. INV NO SEMH/05/01/39/2014-15 DTD 01.08.2014 :71A:OUR -}";
         
         String finOriginal = "{1:F01CCEYLKLXA0010000000000}{2:O1030123456789CCEYLKLXX001N}{4: :20:TRV/TT/14/24300 :23B:CRED :32A:140902USD4166,25 :50K:/1030016666 WINDFORCE (PVT) LTD NO 334 T B JAYAH MAWATHA COLOMBO 10 SRI LANKA :56A:CHASUS33XXX :57A:SCBLUS33XXX :59:/04252430000088 SHETHIA ERECTORS AND MATERIAL HANDLERS LTD 7/8/9/10 B.P.S ANANDA BEHIND AKESHA COLLECTION OFF P.K ROAD MULUND :70:7880-OPERATION AND MAINTENANCE CHARGE. INV NO SEMH/05/01/39/2014-15 DTD 01.08.2014 :71A:OUR -}\n"
         		+ "";
        */
//        
//         String mt103Message2 = "{1:F01BANKUS33XXXX0000000000}{2:I103BANKFRPPXXXXN}{4:\n" +
//        	        ":20:REFERENCE24680\n" +
//        	        ":23B:CRED\n" +
//        	        ":32A:210107USD5000,00\n" +
//        	        ":33B:USD5000,00\n" +
//        	        ":50K:/98765432109876543210\n" +
//        	        "JAMES SMITH\n" +
//        	        "456 WALL STREET\n" +
//        	        "NEW YORK, USA\n" +
//        	        ":59:/12345678901234567890\n" +
//        	        "LUCY DOE\n" +
//        	        "789 MAIN AVENUE\n" +
//        	        "LOS ANGELES, USA\n" +
//        	        ":70:Payment for invoice 24680\n" +
//        	        ":71A:OUR\n" +
//        	        "-}";
//         
//         String mt103Message3 = "{1:F01BANKGBXXXXXX0000000000}{2:I103BANKDEFFXXXXN}{4:\n" +
//        	        ":20:REFERENCE13579\n" +
//        	        ":23B:CRED\n" +
//        	        ":32A:210107EUR3000,00\n" +
//        	        ":33B:EUR3000,00\n" +
//        	        ":50K:/98765432109876543210\n" +
//        	        "JAMES SMITH\n" +
//        	        "456 WALL STREET\n" +
//        	        "NEW YORK, USA\n" +
//        	        ":59:/12345678901234567890\n" +
//        	        "LUCY DOE\n" +
//        	        "789 MAIN AVENUE\n" +
//        	        "LOS ANGELES, USA\n" +
//        	        ":70:Payment for invoice 13579\n" +
//        	        ":71A:OUR\n" +
//        	        "-}";


       /*
        * 
        *  String fin = "{1:F01CCEYLKLXA0010000000000}{2:O1030123456789CCEYLKLXX001N}{4:"
        		+ ":20:TRV/TT/14/24300\n "
        		+ ":23B:CRED\n"
        		+ ":32A:140902USD4166,25\n"
        		+ ":50K:/1030016666 WINDFORCE (PVT) LTD NO 334 T B JAYAH MAWATHA COLOMBO 10 SRI LANKA\n"
        		+ ":56A:CHASUS33XXX "
        		+ ":57A:SCBLUS33XXX "
        		+ ":59:/04252430000088 SHETHIA ERECTORS AND MATERIAL HANDLERS LTD 7/8/9/10 B.P.S ANANDA BEHIND AKESHA COLLECTION OFF P.K ROAD MULUND "
        		+ ":70:7880-OPERATION AND MAINTENANCE CHARGE. INV NO SEMH/05/01/39/2014-15 DTD 01.08.2014 :71A:OUR -}\n"
        		+ "";
        */
        
        
        /*
         * 
         *  
        final String fin = "{1:F21FOOLHKH0AXXX0304009999}{4:{177:1608140809}{451:0}}{1:F01FOOLHKH0AXXX0304009999}{2:O9401609160814FOOLHKH0AXXX03040027341608141609N}{4:\n" +
                ":20:REFERENCE24680\n" +
                ":21:123456/DEV\n" +
                ":25:USD234567\n" +
                ":28C:1/1\n" +
                ":60F:C160418USD672,\n" +
                ":61:160827C642,S1032\n" +
                ":86:ANDY\n" +
                ":61:160827D42,S1032\n" +
                ":86:BANK CHARGES\n" +
                ":62F:C160418USD1872,\n" +
                ":64:C160418USD1872,\n" +
                "-}{5:{CHK:0FEC1E4AEC53}{TNG:}}{S:{COP:S}}";
        
         */
        
		logger.info("**************************************************");
        String fin = "{1:F01CCEYLKLXA0010000000000}{2:O1030123456789CCEYLKLXX001N}{4: :20:TRV/TT/14/24300 :23B:CRED :32A:140902USD4166,25 :50K:/1030016666 WINDFORCE (PVT) LTD NO 334 T B JAYAH MAWATHA COLOMBO 10 SRI LANKA :56A:CHASUS33XXX :57A:SCBLUS33XXX :59:/04252430000088 SHETHIA ERECTORS AND MATERIAL HANDLERS LTD 7/8/9/10 B.P.S ANANDA BEHIND AKESHA COLLECTION OFF P.K ROAD MULUND :70:7880-OPERATION AND MAINTENANCE CHARGE. INV NO SEMH/05/01/39/2014-15 DTD 01.08.2014 :71A:OUR -}";
        logger.info(fin);
        
        String originalString = fin;
        String[] parts = originalString.split(" ");
        String modifiedString = String.join("\n", parts);
       
        try {
        	
        	MT103 mt103 = MT103.parse(modifiedString);
            System.out.println("Sender: " + mt103.getSender());
            System.out.println("Receiver: " + mt103.getReceiver());
            
         
            
            System.out.println("Reference: " + mt103.getField20().getComponent(Field20.REFERENCE));
            System.out.println("Bank Operation Code: " + mt103.getField23B().getValue().replace("\n", " "));
            System.out.println("Value Date, Currency, Amount: " + mt103.getField32A().getValue().replace("\n", " "));
//         	System.out.println("Currency, Amount: " + mt103.getField33B().getValue());
            System.out.println("Ordering Customer: " + mt103.getField50K().getValue().replaceAll("[\\r\\n]+", ""));
            System.out.println("Beneficiary Customer: " + mt103.getField59().getValue().replaceAll("[\\r\\n]+", ""));
            System.out.println("Remittance Information: " + mt103.getField70().getValue().replaceAll("[\\r\\n]+", ""));
//          System.out.println("Details of Charges: " + mt103.getField71A().getValue());
           
       
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
     
        
	}
