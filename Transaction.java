public class Transaction {
        private String name;
	private String type;
	private int transNum;
	private Date date;
	private double amount;


	public Transaction(String name, String type,int transNum,Date date,double amount)
	   {  this.name=name;
	      this.type = type;
	      this.amount = amount;
	   }

	   String getName()
	   {
	      return name;
	   }
	   String getType()
	   {
	      return type;
	   }

	   long getAmount()
	   {
	      return amount;
	   }
	   void setName(String newName) 
	   {
		   this.name = newName;
	   }

	   void setType(String newtype) 
	   {
		   this.type = newtype;
	   }

	   void setAmount(Double amount)
	   {
	      this.amount = amount;
	   }
	   
	   void deposit(Double amount)
	   {
	      this.amount += amount;
	   }

	      void withdrawal(Double amount)
	   {
	      this.amount += amount;
	   }
	   
	   void transfer(Double amount)
	   {
	      this.amount += amount;
	   }
	   
}


