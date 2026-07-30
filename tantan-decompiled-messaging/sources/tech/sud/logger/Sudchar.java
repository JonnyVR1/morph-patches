package tech.sud.logger;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import p149l.kg3;
import tech.sud.base.utils.UtilsBridge;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Sudchar {
    public static String Suddo(Intent intent) {
        boolean z;
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        String action = intent.getAction();
        boolean z2 = false;
        boolean z3 = true;
        if (action != null) {
            sb.append("act=");
            sb.append(action);
            z = false;
        } else {
            z = true;
        }
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cat=[");
            for (String str : categories) {
                if (!z3) {
                    sb.append(',');
                }
                sb.append(str);
                z3 = false;
            }
            sb.append(Constants.AES_SUFFIX);
            z = false;
        }
        Uri data = intent.getData();
        if (data != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("dat=");
            sb.append(data);
            z = false;
        }
        String type = intent.getType();
        if (type != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("typ=");
            sb.append(type);
            z = false;
        }
        int flags = intent.getFlags();
        if (flags != 0) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("flg=0x");
            sb.append(Integer.toHexString(flags));
            z = false;
        }
        String str2 = intent.getPackage();
        if (str2 != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("pkg=");
            sb.append(str2);
            z = false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("cmp=");
            sb.append(component.flattenToShortString());
            z = false;
        }
        Rect sourceBounds = intent.getSourceBounds();
        if (sourceBounds != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("bnds=");
            sb.append(sourceBounds.toShortString());
            z = false;
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            if (!z) {
                sb.append(' ');
            }
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null) {
                sb.append("ClipData.Item {}");
            } else {
                sb.append("ClipData.Item { ");
                String htmlText = itemAt.getHtmlText();
                if (htmlText != null) {
                    sb.append("H:");
                    sb.append(htmlText);
                    sb.append("}");
                } else {
                    CharSequence text = itemAt.getText();
                    if (text != null) {
                        sb.append("T:");
                        sb.append(text);
                        sb.append("}");
                    } else {
                        Uri uri = itemAt.getUri();
                        if (uri != null) {
                            sb.append("U:");
                            sb.append(uri);
                            sb.append("}");
                        } else {
                            Intent intent2 = itemAt.getIntent();
                            if (intent2 != null) {
                                sb.append("I:");
                                sb.append(Suddo(intent2));
                                sb.append("}");
                            } else {
                                sb.append("NULL}");
                            }
                        }
                    }
                }
            }
            z = false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (!z) {
                sb.append(' ');
            }
            sb.append("extras={");
            sb.append(Suddo(extras));
            sb.append('}');
        } else {
            z2 = z;
        }
        Intent selector = intent.getSelector();
        if (selector != null) {
            if (!z2) {
                sb.append(' ');
            }
            sb.append("sel={");
            sb.append(selector == intent ? "(this Intent)" : Suddo(selector));
            sb.append("}");
        }
        sb.append(" }");
        return sb.toString();
    }

    public static String Suddo(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        if (!it.hasNext()) {
            return "Bundle {}";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Bundle { ");
        while (true) {
            String next = it.next();
            Object obj = bundle.get(next);
            sb.append(next);
            sb.append('=');
            if (obj instanceof Bundle) {
                sb.append(obj == bundle ? "(this Bundle)" : Suddo((Bundle) obj));
            } else {
                sb.append(LogUtils.Suddo(obj));
            }
            if (!it.hasNext()) {
                sb.append(" }");
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    public static String Suddo(int i, Object obj) {
        if (obj.getClass().isArray()) {
            if (obj instanceof Object[]) {
                return Arrays.deepToString((Object[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            kg3.m145878a("Array has incompatible type: ", obj.getClass());
            return null;
        }
        if (obj instanceof Throwable) {
            return UtilsBridge.getFullStackTrace((Throwable) obj);
        }
        if (obj instanceof Bundle) {
            return Suddo((Bundle) obj);
        }
        if (obj instanceof Intent) {
            return Suddo((Intent) obj);
        }
        if (i == 32) {
            if (obj instanceof CharSequence) {
                return UtilsBridge.formatJson(obj.toString());
            }
            try {
                return obj.toString();
            } catch (Throwable unused) {
                return obj.toString();
            }
        }
        if (i == 48) {
            String string = obj.toString();
            try {
                StreamSource streamSource = new StreamSource(new StringReader(string));
                StreamResult streamResult = new StreamResult(new StringWriter());
                Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
                transformerNewTransformer.setOutputProperty("indent", "yes");
                transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                transformerNewTransformer.transform(streamSource, streamResult);
                return streamResult.getWriter().toString().replaceFirst(">", ">" + LogUtils.LINE_SEP);
            } catch (Exception e) {
                e.printStackTrace();
                return string;
            }
        }
        return obj.toString();
    }
}
