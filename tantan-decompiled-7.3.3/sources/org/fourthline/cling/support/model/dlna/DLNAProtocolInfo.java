package org.fourthline.cling.support.model.dlna;

import com.meituan.robust.Constants;
import java.util.EnumMap;
import java.util.Map;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.model.Protocol;
import org.fourthline.cling.support.model.ProtocolInfo;
import org.seamless.util.MimeType;

/* JADX INFO: loaded from: classes3.dex */
public class DLNAProtocolInfo extends ProtocolInfo {
    protected final Map<DLNAAttribute.Type, DLNAAttribute> attributes;

    public DLNAProtocolInfo(DLNAProfiles dLNAProfiles, EnumMap<DLNAAttribute.Type, DLNAAttribute> enumMap) {
        super(MimeType.valueOf(dLNAProfiles.getContentFormat()));
        EnumMap enumMap2 = new EnumMap(DLNAAttribute.Type.class);
        this.attributes = enumMap2;
        enumMap2.putAll(enumMap);
        enumMap2.put(DLNAAttribute.Type.DLNA_ORG_PN, new DLNAProfileAttribute(dLNAProfiles));
        this.additionalInfo = getAttributesString();
    }

    public boolean contains(DLNAAttribute.Type type) {
        return this.attributes.containsKey(type);
    }

    public DLNAAttribute getAttribute(DLNAAttribute.Type type) {
        return this.attributes.get(type);
    }

    public Map<DLNAAttribute.Type, DLNAAttribute> getAttributes() {
        return this.attributes;
    }

    public String getAttributesString() {
        String string = "";
        for (DLNAAttribute.Type type : DLNAAttribute.Type.values()) {
            String string2 = this.attributes.containsKey(type) ? this.attributes.get(type).getString() : null;
            if (string2 != null && string2.length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(string.length() == 0 ? "" : Constants.PACKNAME_END);
                sb.append(type.getAttributeName());
                sb.append("=");
                sb.append(string2);
                string = sb.toString();
            }
        }
        return string;
    }

    public void parseAdditionalInfo() {
        DLNAAttribute.Type typeValueOfAttributeName;
        String str = this.additionalInfo;
        if (str != null) {
            for (String str2 : str.split(Constants.PACKNAME_END)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2 && (typeValueOfAttributeName = DLNAAttribute.Type.valueOfAttributeName(strArrSplit[0])) != null) {
                    this.attributes.put(typeValueOfAttributeName, DLNAAttribute.newInstance(typeValueOfAttributeName, strArrSplit[1], getContentFormat()));
                }
            }
        }
    }

    public DLNAProtocolInfo(MimeType mimeType) {
        super(mimeType);
        this.attributes = new EnumMap(DLNAAttribute.Type.class);
    }

    public DLNAProtocolInfo(DLNAProfiles dLNAProfiles) {
        super(MimeType.valueOf(dLNAProfiles.getContentFormat()));
        EnumMap enumMap = new EnumMap(DLNAAttribute.Type.class);
        this.attributes = enumMap;
        enumMap.put(DLNAAttribute.Type.DLNA_ORG_PN, new DLNAProfileAttribute(dLNAProfiles));
        this.additionalInfo = getAttributesString();
    }

    public DLNAProtocolInfo(String str) throws InvalidValueException {
        super(str);
        this.attributes = new EnumMap(DLNAAttribute.Type.class);
        parseAdditionalInfo();
    }

    public DLNAProtocolInfo(Protocol protocol, String str, String str2, String str3) {
        super(protocol, str, str2, str3);
        this.attributes = new EnumMap(DLNAAttribute.Type.class);
        parseAdditionalInfo();
    }

    public DLNAProtocolInfo(Protocol protocol, String str, String str2, EnumMap<DLNAAttribute.Type, DLNAAttribute> enumMap) {
        super(protocol, str, str2, "");
        EnumMap enumMap2 = new EnumMap(DLNAAttribute.Type.class);
        this.attributes = enumMap2;
        enumMap2.putAll(enumMap);
        this.additionalInfo = getAttributesString();
    }

    public DLNAProtocolInfo(ProtocolInfo protocolInfo) {
        this(protocolInfo.getProtocol(), protocolInfo.getNetwork(), protocolInfo.getContentFormat(), protocolInfo.getAdditionalInfo());
    }
}
