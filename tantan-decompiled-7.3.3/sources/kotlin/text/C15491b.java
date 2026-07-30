package kotlin.text;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15491b;
import org.jetbrains.annotations.NotNull;
import p153l.s8g0;

/* JADX INFO: renamed from: kotlin.text.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Ljava/lang/String;", "newIndent", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "g", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, m88122k = 5, m88123mv = {2, 2, 0}, m88125xi = 49, m88126xs = "kotlin/text/StringsKt")
@SourceDebugExtension
public class C15491b extends s8g0 {
    /* JADX INFO: renamed from: d */
    public static final Function1<String, String> m94356d(final String str) {
        return str.length() == 0 ? new Function1() { // from class: l.t8g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15491b.m94357e((String) obj);
            }
        } : new Function1() { // from class: l.u8g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C15491b.m94358f(str, (String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static final String m94357e(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static final String m94358f(String str, String str2) {
        str2.getClass();
        return str + str2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN] */
    /* JADX INFO: renamed from: g */
    public static final int m94359g(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (!CharsKt__CharJVMKt.m94223b(str.charAt(i))) {
                if (i == -1) {
                    return str.length();
                }
                return i;
            }
            i++;
        }
        i = -1;
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m94360h(@NotNull String str, @NotNull String str2) {
        String strInvoke;
        str.getClass();
        str2.getClass();
        List<String> listM94337m0 = StringsKt__StringsKt.m94337m0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM94337m0) {
            if (!StringsKt__StringsKt.m94329e0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m94359g((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listM94337m0.size());
        Function1<String, String> function1M94356d = m94356d(str2);
        int lastIndex = CollectionsKt.getLastIndex(listM94337m0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM94337m0) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == lastIndex) && StringsKt__StringsKt.m94329e0(str3)) {
                str3 = null;
            } else {
                String strM94384a1 = C15497h.m94384a1(str3, iIntValue);
                if (strM94384a1 != null && (strInvoke = function1M94356d.invoke(strM94384a1)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        return ((StringBuilder) CollectionsKt.joinTo$default(arrayList3, new StringBuilder(length), SignParameters.NEW_LINE, null, null, 0, null, null, 124, null)).toString();
    }

    @IntrinsicConstEvaluation
    @NotNull
    /* JADX INFO: renamed from: i */
    public static String m94361i(@NotNull String str) {
        str.getClass();
        return m94360h(str, "");
    }
}
