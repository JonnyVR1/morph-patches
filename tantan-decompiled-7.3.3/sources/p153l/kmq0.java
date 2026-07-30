package p153l;

import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import com.sunshine.engine.base.AbstractC13647a;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes11.dex */
public abstract class kmq0<T extends AbstractC13647a> extends DefaultHandler {

    /* JADX INFO: renamed from: a */
    private StringBuilder f127529a = null;

    /* JADX INFO: renamed from: b */
    protected T f127530b = null;

    /* JADX INFO: renamed from: a */
    public abstract void mo138100a(String str, String[] strArr, boolean z);

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        super.characters(cArr, i, i2);
        this.f127529a.append(cArr, i, i2);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        super.endElement(str, str2, str3);
        if (str2.length() == 0) {
            str2 = str3;
        }
        String[] strArrSplit = this.f127529a.toString().split(Constants.SEPARATOR_COMMA);
        if (!"src_id_ltwh".equals(str2)) {
            mo138100a(str2, strArrSplit, false);
            return;
        }
        Rect rect = new Rect();
        rect.left = Integer.valueOf(strArrSplit[1]).intValue();
        rect.top = Integer.valueOf(strArrSplit[2]).intValue();
        rect.right = rect.left + Integer.valueOf(strArrSplit[3]).intValue();
        rect.bottom = rect.top + Integer.valueOf(strArrSplit[4]).intValue();
        this.f127530b.f56525y.put(strArrSplit[0], rect);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        super.startDocument();
        StringBuilder sb = new StringBuilder();
        this.f127529a = sb;
        sb.setLength(0);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if (str2.length() == 0) {
            str2 = str3;
        }
        mo138100a(str2, this.f127529a.toString().split(Constants.SEPARATOR_COMMA), true);
        this.f127529a.setLength(0);
    }
}
