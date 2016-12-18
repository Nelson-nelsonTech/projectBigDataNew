package view;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
 
@ManagedBean
@ViewScoped
public class DropdownView implements Serializable {
     
    private Map<String,Map<String,String>> data = new HashMap<String, Map<String,String>>();
    private String country; 
    private String city;  
    private Map<String,String> countries;
    private Map<String,String> cities;
     
    @PostConstruct
    public void init() {
        countries  = new HashMap<String, String>();
        countries.put("USA", "USA");
        countries.put("Germany", "Germany");
        countries.put("Brazil", "Brazil");
        countries.put("AF","Afghanistan");
    	countries.put("AX","�land Islands");
    	countries.put("AL","Albania");
    	countries.put("DZ","Algeria");
    	countries.put("AS","American Samoa");
    	countries.put("AD","Andorra");
    	countries.put("AO","Angola");
    	countries.put("AI","Anguilla");
    	countries.put("AQ","Antarctica");
    	countries.put("AG","Antigua and Barbuda");
    	countries.put("AR","Argentina");
    	countries.put("AM","Armenia");
    	countries.put("AW","Aruba");
    	countries.put("AU","Australia");
    	countries.put("AT","Austria");
    	countries.put("AZ","Azerbaijan");
    	countries.put("BS","Bahamas");
    	countries.put("BH","Bahrain");
    	countries.put("BD","Bangladesh");
    	countries.put("BB","Barbados");
    	countries.put("BY","Belarus");
    	countries.put("BE","Belgium");
    	countries.put("BZ","Belize");
    	countries.put("BJ","Benin");
    	countries.put("BM","Bermuda");
    	countries.put("BT","Bhutan");
    	countries.put("BO","Bolivia, Plurinational State of");
    	countries.put("BQ","Bonaire, Sint Eustatius and Saba");
    	countries.put("BA","Bosnia and Herzegovina");
    	countries.put("BW","Botswana");
    	countries.put("BV","Bouvet Island");
    	countries.put("BR","Brazil");
    	countries.put("IO","British Indian Ocean Territory");
    	countries.put("BN","Brunei Darussalam");
    	countries.put("BG","Bulgaria");
    	countries.put("BF","Burkina Faso");
    	countries.put("BI","Burundi");
    	countries.put("KH","Cambodia");
    	countries.put("CM","Cameroon");
    	countries.put("CA","Canada");
    	countries.put("CV","Cape Verde");
    	countries.put("KY","Cayman Islands");
    	countries.put("CF","Central African Republic");
    	countries.put("TD","Chad");
    	countries.put("CL","Chile");
    	countries.put("CN","China");
    	countries.put("CX","Christmas Island");
    	countries.put("CC","Cocos (Keeling) Islands");
    	countries.put("CO","Colombia");
    	countries.put("KM","Comoros");
    	countries.put("CG","Congo");
    	countries.put("CD","Congo, the Democratic Republic of the");
    	countries.put("CK","Cook Islands");
    	countries.put("CR","Costa Rica");
    	countries.put("CI","C�te d'Ivoire");
    	countries.put("HR","Croatia");
    	countries.put("CU","Cuba");
    	countries.put("CW","Cura�ao");
    	countries.put("CY","Cyprus");
    	countries.put("CZ","Czech Republic");
    	countries.put("DK","Denmark");
    	countries.put("DJ","Djibouti");
    	countries.put("DM","Dominica");
    	countries.put("DO","Dominican Republic");
    	countries.put("EC","Ecuador");
    	countries.put("EG","Egypt");
    	countries.put("SV","El Salvador");
    	countries.put("GQ","Equatorial Guinea");
    	countries.put("ER","Eritrea");
    	countries.put("EE","Estonia");
    	countries.put("ET","Ethiopia");
    	countries.put("FK","Falkland Islands (Malvinas)");
    	countries.put("FO","Faroe Islands");
    	countries.put("FJ","Fiji");
    	countries.put("FI","Finland");
    	countries.put("FR","France");
    	countries.put("GF","French Guiana");
    	countries.put("PF","French Polynesia");
    	countries.put("TF","French Southern Territories");
    	countries.put("GA","Gabon");
    	countries.put("GM","Gambia");
    	countries.put("GE","Georgia");
    	countries.put("DE","Germany");
    	countries.put("GH","Ghana");
    	countries.put("GI","Gibraltar");
    	countries.put("GR","Greece");
    	countries.put("GL","Greenland");
    	countries.put("GD","Grenada");
    	countries.put("GP","Guadeloupe");
    	countries.put("GU","Guam");
    	countries.put("GT","Guatemala");
    	countries.put("GG","Guernsey");
    	countries.put("GN","Guinea");
    	countries.put("GW","Guinea-Bissau");
    	countries.put("GY","Guyana");
    	countries.put("HT","Haiti");
    	countries.put("HM","Heard Island and McDonald Islands");
    	countries.put("VA","Holy See (Vatican City State)");
    	countries.put("HN","Honduras");
    	countries.put("HK","Hong Kong");
    	countries.put("HU","Hungary");
    	countries.put("IS","Iceland");
    	countries.put("IN","India");
    	countries.put("ID","Indonesia");
    	countries.put("IR","Iran, Islamic Republic of");
    	countries.put("IQ","Iraq");
    	countries.put("IE","Ireland");
    	countries.put("IM","Isle of Man");
    	countries.put("IL","Israel");
    	countries.put("IT","Italy");
    	countries.put("JM","Jamaica");
    	countries.put("JP","Japan");
    	countries.put("JE","Jersey");
    	countries.put("JO","Jordan");
    	countries.put("KZ","Kazakhstan");
    	countries.put("KE","Kenya");
    	countries.put("KI","Kiribati");
    	countries.put("KP","Korea, Democratic People's Republic of");
    	countries.put("KR","Korea, Republic of");
    	countries.put("KW","Kuwait");
    	countries.put("KG","Kyrgyzstan");
    	countries.put("LA","Lao People's Democratic Republic");
    	countries.put("LV","Latvia");
    	countries.put("LB","Lebanon");
    	countries.put("LS","Lesotho");
    	countries.put("LR","Liberia");
    	countries.put("LY","Libya");
    	countries.put("LI","Liechtenstein");
    	countries.put("LT","Lithuania");
    	countries.put("LU","Luxembourg");
    	countries.put("MO","Macao");
    	countries.put("MK","Macedonia, the former Yugoslav Republic of");
    	countries.put("MG","Madagascar");
    	countries.put("MW","Malawi");
    	countries.put("MY","Malaysia");
    	countries.put("MV","Maldives");
    	countries.put("ML","Mali");
    	countries.put("MT","Malta");
    	countries.put("MH","Marshall Islands");
    	countries.put("MQ","Martinique");
    	countries.put("MR","Mauritania");
    	countries.put("MU","Mauritius");
    	countries.put("YT","Mayotte");
    	countries.put("MX","Mexico");
    	countries.put("FM","Micronesia, Federated States of");
    	countries.put("MD","Moldova, Republic of");
    	countries.put("MC","Monaco");
    	countries.put("MN","Mongolia");
    	countries.put("ME","Montenegro");
    	countries.put("MS","Montserrat");
    	countries.put("MA","Morocco");
    	countries.put("MZ","Mozambique");
    	countries.put("MM","Myanmar");
    	countries.put("NA","Namibia");
    	countries.put("NR","Nauru");
    	countries.put("NP","Nepal");
    	countries.put("NL","Netherlands");
    	countries.put("NC","New Caledonia");
    	countries.put("NZ","New Zealand");
    	countries.put("NI","Nicaragua");
    	countries.put("NE","Niger");
    	countries.put("NG","Nigeria");
    	countries.put("NU","Niue");
    	countries.put("NF","Norfolk Island");
    	countries.put("MP","Northern Mariana Islands");
    	countries.put("NO","Norway");
    	countries.put("OM","Oman");
    	countries.put("PK","Pakistan");
    	countries.put("PW","Palau");
    	countries.put("PS","Palestinian Territory, Occupied");
    	countries.put("PA","Panama");
    	countries.put("PG","Papua New Guinea");
    	countries.put("PY","Paraguay");
    	countries.put("PE","Peru");
    	countries.put("PH","Philippines");
    	countries.put("PN","Pitcairn");
    	countries.put("PL","Poland");
    	countries.put("PT","Portugal");
    	countries.put("PR","Puerto Rico");
    	countries.put("QA","Qatar");
    	countries.put("RE","R�union");
    	countries.put("RO","Romania");
    	countries.put("RU","Russian Federation");
    	countries.put("RW","Rwanda");
    	countries.put("BL","Saint Barth�lemy");
    	countries.put("SH","Saint Helena, Ascension and Tristan da Cunha");
    	countries.put("KN","Saint Kitts and Nevis");
    	countries.put("LC","Saint Lucia");
    	countries.put("MF","Saint Martin (French part)");
    	countries.put("PM","Saint Pierre and Miquelon");
    	countries.put("VC","Saint Vincent and the Grenadines");
    	countries.put("WS","Samoa");
    	countries.put("SM","San Marino");
    	countries.put("ST","Sao Tome and Principe");
    	countries.put("SA","Saudi Arabia");
    	countries.put("SN","Senegal");
    	countries.put("RS","Serbia");
    	countries.put("SC","Seychelles");
    	countries.put("SL","Sierra Leone");
    	countries.put("SG","Singapore");
    	countries.put("SX","Sint Maarten (Dutch part)");
    	countries.put("SK","Slovakia");
    	countries.put("SI","Slovenia");
    	countries.put("SB","Solomon Islands");
    	countries.put("SO","Somalia");
    	countries.put("ZA","South Africa");
    	countries.put("GS","South Georgia and the South Sandwich Islands");
    	countries.put("SS","South Sudan");
    	countries.put("ES","Spain");
    	countries.put("LK","Sri Lanka");
    	countries.put("SD","Sudan");
    	countries.put("SR","Suriname");
    	countries.put("SJ","Svalbard and Jan Mayen");
    	countries.put("SZ","Swaziland");
    	countries.put("SE","Sweden");
    	countries.put("CH","Switzerland");
    	countries.put("SY","Syrian Arab Republic");
    	countries.put("TW","Taiwan, Province of China");
    	countries.put("TJ","Tajikistan");
    	countries.put("TZ","Tanzania, United Republic of");
    	countries.put("TH","Thailand");
    	countries.put("TL","Timor-Leste");
    	countries.put("TG","Togo");
    	countries.put("TK","Tokelau");
    	countries.put("TO","Tonga");
    	countries.put("TT","Trinidad and Tobago");
    	countries.put("TN","Tunisia");
    	countries.put("TR","Turkey");
    	countries.put("TM","Turkmenistan");
    	countries.put("TC","Turks and Caicos Islands");
    	countries.put("TV","Tuvalu");
    	countries.put("UG","Uganda");
    	countries.put("UA","Ukraine");
    	countries.put("AE","United Arab Emirates");
    	countries.put("GB","United Kingdom");
    	countries.put("US","United States");
    	countries.put("UM","United States Minor Outlying Islands");
    	countries.put("UY","Uruguay");
    	countries.put("UZ","Uzbekistan");
    	countries.put("VU","Vanuatu");
    	countries.put("VE","Venezuela, Bolivarian Republic of");
    	countries.put("VN","Viet Nam");
    	countries.put("VG","Virgin Islands, British");
    	countries.put("VI","Virgin Islands, U.S.");
    	countries.put("WF","Wallis and Futuna");
    	countries.put("EH","Western Sahara");
    	countries.put("YE","Yemen");
    	countries.put("ZM","Zambia");
    	countries.put("ZW","Zimbabwe");
        
        
        
         
        Map<String,String> map = new HashMap<String, String>();
        map.put("New York", "New York");
        map.put("San Francisco", "San Francisco");
        map.put("Denver", "Denver");
        data.put("USA", map);
         
        map = new HashMap<String, String>();
        map.put("Berlin", "Berlin");
        map.put("Munich", "Munich");
        map.put("Frankfurt", "Frankfurt");
        data.put("Germany", map);
         
        map = new HashMap<String, String>();
        map.put("Sao Paolo", "Sao Paolo");
        map.put("Rio de Janerio", "Rio de Janerio");
        map.put("Salvador", "Salvador");
        data.put("Brazil", map);
    }
 
    public Map<String, Map<String, String>> getData() {
        return data;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public Map<String, String> getCountries() {
        return countries;
    }
 
    public Map<String, String> getCities() {
        return cities;
    }
 
    public void onCountryChange() {
        if(country !=null && !country.equals(""))
            cities = data.get(country);
        else
            cities = new HashMap<String, String>();
    }
     
    public void displayLocation() {
        FacesMessage msg;
        if(city != null && country != null)
            msg = new FacesMessage("Selected", city + " of " + country);
        else
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid", "City is not selected."); 
             
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }
}