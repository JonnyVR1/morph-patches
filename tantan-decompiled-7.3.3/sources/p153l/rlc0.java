package p153l;

import androidx.work.C0769g;
import androidx.work.WorkInfo;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Landroidx/work/g;", "Ll/q7h0;", "b", "(Landroidx/work/g;)Ll/q7h0;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "count", "", "a", "(Ljava/lang/StringBuilder;I)V", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class rlc0 {
    /* JADX INFO: renamed from: a */
    public static final void m181939a(StringBuilder sb, int i) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(CollectionsKt.joinToString$default(arrayList, Constants.SEPARATOR_COMMA, null, null, 0, null, null, 62, null));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final q7h0 m181940b(@NotNull C0769g c0769g) {
        String str;
        c0769g.getClass();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        String str2 = " AND";
        if (c0769g.m4430b().isEmpty()) {
            str = " WHERE";
        } else {
            List<WorkInfo.State> listM4430b = c0769g.m4430b();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM4430b, 10));
            Iterator<T> it = listM4430b.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(yjq0.m216427k((WorkInfo.State) it.next())));
            }
            sb.append(" WHERE state IN (");
            m181939a(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str = " AND";
        }
        if (!c0769g.m4429a().isEmpty()) {
            List<UUID> listM4429a = c0769g.m4429a();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM4429a, 10));
            Iterator<T> it2 = listM4429a.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb.append(str.concat(" id IN ("));
            m181939a(sb, c0769g.m4429a().size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str = " AND";
        }
        if (c0769g.m4431c().isEmpty()) {
            str2 = str;
        } else {
            sb.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            m181939a(sb, c0769g.m4431c().size());
            sb.append("))");
            arrayList.addAll(c0769g.m4431c());
        }
        if (!c0769g.m4432d().isEmpty()) {
            sb.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            m181939a(sb, c0769g.m4432d().size());
            sb.append("))");
            arrayList.addAll(c0769g.m4432d());
        }
        sb.append(com.meituan.robust.Constants.PACKNAME_END);
        return new vpf0(sb.toString(), arrayList.toArray(new Object[0]));
    }
}
