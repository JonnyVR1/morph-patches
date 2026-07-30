package com.immomo.mmdns;

import com.heytap.mcssdk.mode.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m87232d2 = {"Lcom/immomo/mmdns/DomainMatcher;", "", "includes", "", "", "excludes", "(Ljava/util/List;Ljava/util/List;)V", "excludeRules", "Lkotlin/text/Regex;", "includeRules", "matches", "", "domain", "toRegex", Message.RULE, "toString", "mmdns_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final class DomainMatcher {
    private final List<Regex> excludeRules;
    private final List<Regex> includeRules;

    public DomainMatcher(@NotNull List<String> list, @NotNull List<String> list2) {
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!StringsKt.m93438e0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(toRegex((String) it.next()));
        }
        this.includeRules = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (!StringsKt.m93438e0((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(toRegex((String) it2.next()));
        }
        this.excludeRules = arrayList4;
    }

    private final Regex toRegex(String rule) {
        String str;
        if (StringsKt.m93412P(rule, "*.", false, 2, null)) {
            str = "^" + C15386d.m93479F(C15386d.m93479F(rule, ".", "\\.", false, 4, null), "*", "[^.]+", false, 4, null) + "$";
        } else if (C15386d.m93483J(rule, "+.", false, 2, null)) {
            str = "^(.+\\.)?" + Regex.INSTANCE.m93376c(StringsKt.m93456w0(rule, "+.")) + '$';
        } else if (C15386d.m93483J(rule, ".", false, 2, null)) {
            str = "^(.+\\.)" + Regex.INSTANCE.m93376c(StringsKt.m93456w0(rule, ".")) + '$';
        } else if (Intrinsics.m87488d(rule, "*")) {
            str = "^[^.]+$";
        } else {
            str = "^" + Regex.INSTANCE.m93376c(rule) + '$';
        }
        return new Regex(str);
    }

    public final boolean matches(@NotNull String domain) {
        domain.getClass();
        List<Regex> list = this.excludeRules;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Regex) it.next()).matches(domain)) {
                    return false;
                }
            }
        }
        if (this.includeRules.isEmpty()) {
            return true;
        }
        List<Regex> list2 = this.includeRules;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((Regex) it2.next()).matches(domain)) {
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
        sb.append(", excludeRules=");
        List<Regex> list2 = this.excludeRules;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Regex) it2.next()).getPattern());
        }
        sb.append(arrayList2);
        sb.append(')');
        return sb.toString();
    }
}
