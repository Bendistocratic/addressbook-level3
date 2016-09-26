package seedu.addressbook.storage.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class AdaptedContactDetail extends AdaptedPerson {
    
    @XmlValue
    protected String value;
    @XmlAttribute(required = true)
    protected boolean isPrivate;
}
