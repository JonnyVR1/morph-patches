package org.fourthline.cling.binding.xml;

import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.Device;
import org.seamless.xml.ParserException;
import org.xml.sax.SAXParseException;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RecoveringUDA10DeviceDescriptorBinderImpl extends UDA10DeviceDescriptorBinderImpl {
    private static Logger log = Logger.getLogger(RecoveringUDA10DeviceDescriptorBinderImpl.class.getName());

    private String fixGarbageLeadingChars(String str) {
        int iIndexOf = str.indexOf("<?xml");
        return iIndexOf == -1 ? str : str.substring(iIndexOf);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:25:0x007f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.processExcHandler(ExcHandlersRegionMaker.java:154)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:77)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // org.fourthline.cling.binding.xml.UDA10DeviceDescriptorBinderImpl, org.fourthline.cling.binding.xml.DeviceDescriptorBinder
    public <D extends org.fourthline.cling.model.meta.Device> D describe(D r9, java.lang.String r10) throws org.fourthline.cling.binding.xml.DescriptorBindingException, org.fourthline.cling.model.ValidationException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fourthline.cling.binding.xml.RecoveringUDA10DeviceDescriptorBinderImpl.describe(org.fourthline.cling.model.meta.Device, java.lang.String):org.fourthline.cling.model.meta.Device");
    }

    public String fixGarbageTrailingChars(String str, DescriptorBindingException descriptorBindingException) {
        int iIndexOf = str.indexOf("</root>");
        if (iIndexOf == -1) {
            log.warning("No closing </root> element in descriptor");
            return null;
        }
        if (str.length() == iIndexOf + 7) {
            return null;
        }
        log.warning("Detected garbage characters after <root> node, removing");
        return str.substring(0, iIndexOf).concat("</root>");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[PHI: r8
      0x0044: PHI (r8v8 java.util.regex.Matcher) = (r8v7 java.util.regex.Matcher), (r8v4 java.util.regex.Matcher) binds: [B:17:0x0040, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0044, please report this as an issue */
    public String fixMissingNamespaces(String str, DescriptorBindingException descriptorBindingException) {
        String message;
        Matcher matcher;
        Throwable cause = descriptorBindingException.getCause();
        if ((!(cause instanceof SAXParseException) && !(cause instanceof ParserException)) || (message = cause.getMessage()) == null) {
            return null;
        }
        Matcher matcher2 = Pattern.compile("The prefix \"(.*)\" for element").matcher(message);
        if (matcher2.find() && matcher2.groupCount() == 1) {
            String strGroup = matcher2.group(1);
            log.warning("Fixing missing namespace declaration for: " + strGroup);
            matcher = Pattern.compile("<root([^>]*)").matcher(str);
            if (!matcher.find()) {
            }
            log.fine("Could not find <root> element attributes");
        } else {
            matcher2 = Pattern.compile("undefined prefix: ([^ ]*)").matcher(message);
            if (matcher2.find() && matcher2.groupCount() == 1) {
                String strGroup2 = matcher2.group(1);
                log.warning("Fixing missing namespace declaration for: " + strGroup2);
                matcher = Pattern.compile("<root([^>]*)").matcher(str);
                if (!matcher.find() && matcher.groupCount() == 1) {
                    String strGroup3 = matcher.group(1);
                    log.fine("Preserving existing <root> element attributes/namespace declarations: " + matcher.group(0));
                    Matcher matcher3 = Pattern.compile("<root[^>]*>(.*)</root>", 32).matcher(str);
                    if (!matcher3.find() || matcher3.groupCount() != 1) {
                        log.fine("Could not extract body of <root> element");
                        return null;
                    }
                    return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><root " + String.format(Locale.ROOT, "xmlns:%s=\"urn:schemas-dlna-org:device-1-0\"", strGroup2) + strGroup3 + ">" + matcher3.group(1) + "</root>";
                }
                log.fine("Could not find <root> element attributes");
            }
        }
        return null;
    }

    public void handleInvalidDescriptor(String str, DescriptorBindingException descriptorBindingException) throws DescriptorBindingException {
        throw descriptorBindingException;
    }

    public <D extends Device> D handleInvalidDevice(String str, D d, ValidationException validationException) throws ValidationException {
        throw validationException;
    }
}
