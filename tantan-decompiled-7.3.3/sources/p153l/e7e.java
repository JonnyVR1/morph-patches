package p153l;

import com.heytap.mcssdk.mode.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/e7e;", "", "", "", "includes", "<init>", "(Ljava/util/List;)V", Message.RULE, "Lkotlin/text/Regex;", "b", "(Ljava/lang/String;)Lkotlin/text/Regex;", "domain", "", "a", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "includeRules", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class e7e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<Regex> includeRules;

    public e7e(@NotNull List<String> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.m94329e0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m119704b((String) it.next()));
        }
        this.includeRules = arrayList2;
    }

    /* JADX INFO: renamed from: b */
    private final Regex m119704b(String rule) {
        String str;
        if (StringsKt.m94303P(rule, "*.", false, 2, null)) {
            str = "^" + C15493d.m94370F(C15493d.m94370F(rule, ".", "\\.", false, 4, null), "*", "[^.]+", false, 4, null) + "$";
        } else if (C15493d.m94374J(rule, "+.", false, 2, null)) {
            str = "^(.+\\.)?" + Regex.INSTANCE.m94267c(StringsKt.m94347w0(rule, "+.")) + '$';
        } else if (C15493d.m94374J(rule, ".", false, 2, null)) {
            str = "^(.+\\.)" + Regex.INSTANCE.m94267c(StringsKt.m94347w0(rule, ".")) + '$';
        } else if (Intrinsics.m88377d(rule, "*")) {
            str = "^[^.]+$";
        } else {
            str = "^" + Regex.INSTANCE.m94267c(rule) + '$';
        }
        return new Regex(str);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m119705a(@NotNull String domain) {
        domain.getClass();
        List<Regex> list = this.includeRules;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Regex) it.next()).matches(domain)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DomainMatcher(includeRules=");
        List<Regex> list = this.includeRules;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Regex) it.next()).getPattern());
        }
        sb.append(arrayList);
        sb.append(')');
        return sb.toString();
    }
}
