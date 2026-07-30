package p153l;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qke0 {

    /* JADX INFO: renamed from: d */
    public static final txf0 f158125d = txf0.m193491d(':');

    /* JADX INFO: renamed from: e */
    public static final txf0 f158126e = txf0.m193491d('*');

    /* JADX INFO: renamed from: a */
    public final List<C19593a> f158127a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f158128b = 0;

    /* JADX INFO: renamed from: c */
    public int f158129c;

    /* JADX INFO: renamed from: l.qke0$a */
    public static final class C19593a {

        /* JADX INFO: renamed from: a */
        public final int f158130a;

        /* JADX INFO: renamed from: b */
        public final long f158131b;

        /* JADX INFO: renamed from: c */
        public final int f158132c;

        public C19593a(int i, long j, int i2) {
            this.f158130a = i;
            this.f158131b = j;
            this.f158132c = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m176943b(String str) throws ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static SlowMotionData m176944f(ig60 ig60Var, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listM193493f = f158126e.m193493f(ig60Var.m139792E(i));
        for (int i2 = 0; i2 < listM193493f.size(); i2++) {
            List<String> listM193493f2 = f158125d.m193493f(listM193493f.get(i2));
            if (listM193493f2.size() != 3) {
                throw ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listM193493f2.get(0)), Long.parseLong(listM193493f2.get(1)), 1 << (Integer.parseInt(listM193493f2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedContainer(null, e);
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m176945a(asf asfVar, ll80 ll80Var) throws IOException {
        ig60 ig60Var = new ig60(8);
        asfVar.readFully(ig60Var.m139815e(), 0, 8);
        this.f158129c = ig60Var.m139831u() + 8;
        if (ig60Var.m139827q() != 1397048916) {
            ll80Var.f132534a = 0L;
        } else {
            ll80Var.f132534a = asfVar.getPosition() - ((long) (this.f158129c - 12));
            this.f158128b = 2;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m176946c(asf asfVar, ll80 ll80Var, List<Metadata.Entry> list) throws IOException {
        int i = this.f158128b;
        long j = 0;
        if (i == 0) {
            long length = asfVar.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            ll80Var.f132534a = j;
            this.f158128b = 1;
        } else if (i == 1) {
            m176945a(asfVar, ll80Var);
        } else if (i == 2) {
            m176947d(asfVar, ll80Var);
        } else {
            if (i != 3) {
                wpg0.m207458a();
                return 0;
            }
            m176948e(asfVar, list);
            ll80Var.f132534a = 0L;
        }
        return 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m176947d(asf asfVar, ll80 ll80Var) throws IOException {
        long length = asfVar.getLength();
        int i = this.f158129c - 20;
        ig60 ig60Var = new ig60(i);
        asfVar.readFully(ig60Var.m139815e(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            ig60Var.m139809V(2);
            short sM139833w = ig60Var.m139833w();
            if (sM139833w == 2192 || sM139833w == 2816 || sM139833w == 2817 || sM139833w == 2819 || sM139833w == 2820) {
                this.f158127a.add(new C19593a(sM139833w, (length - ((long) this.f158129c)) - ((long) ig60Var.m139831u()), ig60Var.m139831u()));
            } else {
                ig60Var.m139809V(8);
            }
        }
        if (this.f158127a.isEmpty()) {
            ll80Var.f132534a = 0L;
        } else {
            this.f158128b = 3;
            ll80Var.f132534a = this.f158127a.get(0).f158131b;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m176948e(asf asfVar, List<Metadata.Entry> list) throws IOException {
        long position = asfVar.getPosition();
        int length = (int) ((asfVar.getLength() - asfVar.getPosition()) - ((long) this.f158129c));
        ig60 ig60Var = new ig60(length);
        asfVar.readFully(ig60Var.m139815e(), 0, length);
        for (int i = 0; i < this.f158127a.size(); i++) {
            C19593a c19593a = this.f158127a.get(i);
            ig60Var.m139808U((int) (c19593a.f158131b - position));
            ig60Var.m139809V(4);
            int iM139831u = ig60Var.m139831u();
            int iM176943b = m176943b(ig60Var.m139792E(iM139831u));
            int i2 = c19593a.f158132c - (iM139831u + 8);
            if (iM176943b == 2192) {
                list.add(m176944f(ig60Var, i2));
            } else if (iM176943b != 2816 && iM176943b != 2817 && iM176943b != 2819 && iM176943b != 2820) {
                wpg0.m207458a();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m176949g() {
        this.f158127a.clear();
        this.f158128b = 0;
    }
}
