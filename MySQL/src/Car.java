
public class Car {
	int id;
	String regnum;
	String make;
	int enginecc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegnum() {
		return regnum;
	}
	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getEnginecc() {
		return enginecc;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + enginecc;
		result = prime * result + id;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((regnum == null) ? 0 : regnum.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (enginecc != other.enginecc)
			return false;
		if (id != other.id)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (regnum == null) {
			if (other.regnum != null)
				return false;
		} else if (!regnum.equals(other.regnum))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", regnum=" + regnum + ", make=" + make + ", enginecc=" + enginecc + "]";
	}
	
}
