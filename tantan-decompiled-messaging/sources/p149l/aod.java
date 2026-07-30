package p149l;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.common.primitives.Ints;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class aod implements r2l {

    /* JADX INFO: renamed from: d */
    public static final int[] f70839d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b */
    public final int f70840b;

    /* JADX INFO: renamed from: c */
    public final boolean f70841c;

    public aod(int i, boolean z) {
        this.f70840b = i;
        this.f70841c = z;
    }

    /* JADX INFO: renamed from: b */
    public static void m97884b(int i, List<Integer> list) {
        if (Ints.m16464i(f70839d, i) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: e */
    public static i3j m97885e(eri0 eri0Var, C1871k c1871k, @Nullable List<C1871k> list) {
        int i = m97887g(c1871k) ? 4 : 0;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new i3j(i, eri0Var, null, list);
    }

    /* JADX INFO: renamed from: f */
    public static ebj0 m97886f(int i, boolean z, C1871k c1871k, @Nullable List<C1871k> list, eri0 eri0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 = i | 48;
        } else {
            list = z ? Collections.singletonList(new C1871k.b().m10346g0("application/cea-608").m10320G()) : Collections.EMPTY_LIST;
        }
        String str = c1871k.f7745i;
        if (!TextUtils.isEmpty(str)) {
            if (!n200.m157520b(str, "audio/mp4a-latm")) {
                i2 |= 2;
            }
            if (!n200.m157520b(str, YtVideoEncoder.MIME_TYPE)) {
                i2 |= 4;
            }
        }
        return new ebj0(2, eri0Var, new xrd(i2, list));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m97887g(C1871k c1871k) {
        Metadata metadata = c1871k.f7746j;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.m10533e(); i++) {
            Metadata.Entry entryM10532d = metadata.m10532d(i);
            if (entryM10532d instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) entryM10532d).variantInfos.isEmpty();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m97888h(sqf sqfVar, tqf tqfVar) throws IOException {
        try {
            return sqfVar.mo10977f(tqfVar);
        } catch (EOFException unused) {
            return false;
        } finally {
            tqfVar.mo150657h();
        }
    }

    @Override // p149l.r2l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public si3 mo97889a(Uri uri, C1871k c1871k, @Nullable List<C1871k> list, eri0 eri0Var, Map<String, List<String>> map, tqf tqfVar, v680 v680Var) throws IOException {
        int iM130969a = hhi.m130969a(c1871k.f7748l);
        int iM130970b = hhi.m130970b(map);
        int iM130971c = hhi.m130971c(uri);
        int[] iArr = f70839d;
        ArrayList arrayList = new ArrayList(iArr.length);
        m97884b(iM130969a, arrayList);
        m97884b(iM130970b, arrayList);
        m97884b(iM130971c, arrayList);
        for (int i : iArr) {
            m97884b(i, arrayList);
        }
        tqfVar.mo150657h();
        sqf sqfVar = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            sqf sqfVar2 = (sqf) p11.m167011e(m97891d(iIntValue, c1871k, list, eri0Var));
            if (m97888h(sqfVar2, tqfVar)) {
                return new si3(sqfVar2, c1871k, eri0Var);
            }
            if (sqfVar == null && (iIntValue == iM130969a || iIntValue == iM130970b || iIntValue == iM130971c || iIntValue == 11)) {
                sqfVar = sqfVar2;
            }
        }
        return new si3((sqf) p11.m167011e(sqfVar), c1871k, eri0Var);
    }

    @Nullable
    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: d */
    public final sqf m97891d(int i, C1871k c1871k, @Nullable List<C1871k> list, eri0 eri0Var) {
        if (i == 0) {
            return new C16095c9();
        }
        if (i == 1) {
            return new C17024g9();
        }
        if (i == 2) {
            return new z90();
        }
        if (i == 7) {
            return new py00(0, 0L);
        }
        if (i == 8) {
            return m97885e(eri0Var, c1871k, list);
        }
        if (i == 11) {
            return m97886f(this.f70840b, this.f70841c, c1871k, list, eri0Var);
        }
        if (i != 13) {
            return null;
        }
        return new bmp0(c1871k.f7739c, eri0Var);
    }

    public aod() {
        this(0, true);
    }
}
