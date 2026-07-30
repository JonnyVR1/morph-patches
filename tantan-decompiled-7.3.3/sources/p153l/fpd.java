package p153l;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
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
public final class fpd implements h5l {

    /* JADX INFO: renamed from: d */
    public static final int[] f100122d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b */
    public final int f100123b;

    /* JADX INFO: renamed from: c */
    public final boolean f100124c;

    public fpd(int i, boolean z) {
        this.f100123b = i;
        this.f100124c = z;
    }

    /* JADX INFO: renamed from: b */
    public static void m126577b(int i, List<Integer> list) {
        if (Ints.m16519i(f100122d, i) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: e */
    public static d6j m126578e(h0j0 h0j0Var, C1894k c1894k, @Nullable List<C1894k> list) {
        int i = m126580g(c1894k) ? 4 : 0;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new d6j(i, h0j0Var, null, list);
    }

    /* JADX INFO: renamed from: f */
    public static ikj0 m126579f(int i, boolean z, C1894k c1894k, @Nullable List<C1894k> list, h0j0 h0j0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 = i | 48;
        } else {
            list = z ? Collections.singletonList(new C1894k.b().m10400g0("application/cea-608").m10374G()) : Collections.EMPTY_LIST;
        }
        String str = c1894k.f7782i;
        if (!TextUtils.isEmpty(str)) {
            if (!kb00.m149001b(str, "audio/mp4a-latm")) {
                i2 |= 2;
            }
            if (!kb00.m149001b(str, YtVideoEncoder.MIME_TYPE)) {
                i2 |= 4;
            }
        }
        return new ikj0(2, h0j0Var, new mtd(i2, list));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m126580g(C1894k c1894k) {
        Metadata metadata = c1894k.f7783j;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.m10587e(); i++) {
            Metadata.Entry entryM10586d = metadata.m10586d(i);
            if (entryM10586d instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) entryM10586d).variantInfos.isEmpty();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m126581h(zrf zrfVar, asf asfVar) throws IOException {
        try {
            return zrfVar.mo11031f(asfVar);
        } catch (EOFException unused) {
            return false;
        } finally {
            asfVar.mo99902h();
        }
    }

    @Override // p153l.h5l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public gj3 mo126582a(Uri uri, C1894k c1894k, @Nullable List<C1894k> list, h0j0 h0j0Var, Map<String, List<String>> map, asf asfVar, bf80 bf80Var) throws IOException {
        int iM121047a = eki.m121047a(c1894k.f7785l);
        int iM121048b = eki.m121048b(map);
        int iM121049c = eki.m121049c(uri);
        int[] iArr = f100122d;
        ArrayList arrayList = new ArrayList(iArr.length);
        m126577b(iM121047a, arrayList);
        m126577b(iM121048b, arrayList);
        m126577b(iM121049c, arrayList);
        for (int i : iArr) {
            m126577b(i, arrayList);
        }
        asfVar.mo99902h();
        zrf zrfVar = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            zrf zrfVar2 = (zrf) w11.m204369e(m126584d(iIntValue, c1894k, list, h0j0Var));
            if (m126581h(zrfVar2, asfVar)) {
                return new gj3(zrfVar2, c1894k, h0j0Var);
            }
            if (zrfVar == null && (iIntValue == iM121047a || iIntValue == iM121048b || iIntValue == iM121049c || iIntValue == 11)) {
                zrfVar = zrfVar2;
            }
        }
        return new gj3((zrf) w11.m204369e(zrfVar), c1894k, h0j0Var);
    }

    @Nullable
    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: d */
    public final zrf m126584d(int i, C1894k c1894k, @Nullable List<C1894k> list, h0j0 h0j0Var) {
        if (i == 0) {
            return new C21263x8();
        }
        if (i == 1) {
            return new C15947b9();
        }
        if (i == 2) {
            return new v90();
        }
        if (i == 7) {
            return new z610(0, 0L);
        }
        if (i == 8) {
            return m126578e(h0j0Var, c1894k, list);
        }
        if (i == 11) {
            return m126579f(this.f100123b, this.f100124c, c1894k, list, h0j0Var);
        }
        if (i != 13) {
            return null;
        }
        return new fvp0(c1894k.f7776c, h0j0Var);
    }

    public fpd() {
        this(0, true);
    }
}
