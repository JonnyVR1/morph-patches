package p149l;

import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import com.sunshine.engine.base.AbstractC13484a;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes13.dex */
public abstract class fdq0<T extends AbstractC13484a> extends DefaultHandler {

    /* JADX INFO: renamed from: a */
    private StringBuilder f97067a = null;

    /* JADX INFO: renamed from: b */
    protected T f97068b = null;

    /* JADX INFO: renamed from: a */
    public abstract void mo121004a(String str, String[] strArr, boolean z);

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        super.characters(cArr, i, i2);
        this.f97067a.append(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
        if (str2.length() == 0) {
            str2 = str3;
        }
        String[] strArrSplit = this.f97067a.toString().split(Constants.SEPARATOR_COMMA);
        if (!"src_id_ltwh".equals(str2)) {
            mo121004a(str2, strArrSplit, false);
            return;
        }
        Rect rect = new Rect();
        rect.left = Integer.valueOf(strArrSplit[1]).intValue();
        rect.top = Integer.valueOf(strArrSplit[2]).intValue();
        rect.right = rect.left + Integer.valueOf(strArrSplit[3]).intValue();
        rect.bottom = rect.top + Integer.valueOf(strArrSplit[4]).intValue();
        this.f97068b.f55677y.put(strArrSplit[0], rect);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        super.startDocument();
        StringBuilder sb = new StringBuilder();
        this.f97067a = sb;
        sb.setLength(0);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if (str2.length() == 0) {
            str2 = str3;
        }
        mo121004a(str2, this.f97067a.toString().split(Constants.SEPARATOR_COMMA), true);
        this.f97067a.setLength(0);
    }
}
