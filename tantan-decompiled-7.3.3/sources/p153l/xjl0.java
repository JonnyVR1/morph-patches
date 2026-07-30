package p153l;

import android.content.Context;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class xjl0 {

    /* JADX INFO: renamed from: h */
    private String f194596h;

    /* JADX INFO: renamed from: i */
    private String f194597i;

    /* JADX INFO: renamed from: j */
    private u7k f194598j;

    /* JADX INFO: renamed from: a */
    private final String f194589a = "VideoResolutionSelector";

    /* JADX INFO: renamed from: b */
    private int f194590b = -1;

    /* JADX INFO: renamed from: c */
    private int f194591c = -1;

    /* JADX INFO: renamed from: d */
    private boolean f194592d = true;

    /* JADX INFO: renamed from: e */
    private boolean f194593e = true;

    /* JADX INFO: renamed from: f */
    private boolean f194594f = true;

    /* JADX INFO: renamed from: g */
    private boolean f194595g = false;

    /* JADX INFO: renamed from: k */
    private int f194599k = -1;

    /* JADX INFO: renamed from: l */
    private boolean f194600l = true;

    /* JADX INFO: renamed from: m */
    private List<C21353a> f194601m = new ArrayList();

    /* JADX INFO: renamed from: n */
    private VideoDataRetrieverBySoft f194602n = null;

    /* JADX INFO: renamed from: l.xjl0$a */
    public class C21353a {

        /* JADX INFO: renamed from: a */
        public int f194603a;

        /* JADX INFO: renamed from: b */
        public boolean f194604b = false;

        /* JADX INFO: renamed from: c */
        public boolean f194605c = false;

        public C21353a(int i) {
            this.f194603a = i;
        }
    }

    public xjl0(String str, Context context) {
        this.f194596h = str;
        this.f194597i = this.f194596h + "Res_2017_10-10.ini";
        if (this.f194598j == null && context != null) {
            this.f194598j = new u7k(context);
        }
        if (this.f194595g) {
            return;
        }
        m211234f();
    }

    /* JADX INFO: renamed from: d */
    private void m211229d() {
        try {
            File file = new File(this.f194596h);
            MDLog.m7449i("VideoResolutionSelector", "path = " + this.f194596h);
            if (!file.exists() || !file.isDirectory()) {
                file.mkdirs();
            }
            if (new File(this.f194596h, "Res_2017_10-10.ini").createNewFile()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f194597i, "rw");
                for (int i = 0; i < 3; i++) {
                    randomAccessFile.writeInt(0);
                }
                randomAccessFile.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public int m211230a() {
        u7k u7kVar = this.f194598j;
        int iM194873o = u7kVar != null ? u7kVar.m194873o(true) : 2;
        if (iM194873o == 1) {
            this.f194599k = 0;
            return 0;
        }
        if (iM194873o == 2) {
            this.f194599k = 1;
            return 0;
        }
        if (iM194873o != 3) {
            return 2;
        }
        this.f194599k = 3;
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public void m211231b(C21353a c21353a) {
        boolean z = c21353a.f194604b;
        if (!z) {
            this.f194593e = false;
        }
        if (z) {
            this.f194594f = false;
        }
        this.f194601m.add(c21353a);
    }

    /* JADX INFO: renamed from: c */
    public void m211232c(String str) {
        if (this.f194602n == null) {
            this.f194602n = new VideoDataRetrieverBySoft();
        }
        if (!this.f194602n.init(str)) {
            MDLog.m7445e("VideoResolutionSelect", "Init videodataRetriever failed !");
            return;
        }
        int width = this.f194602n.getWidth();
        int frameRate = this.f194602n.getFrameRate();
        if (width == 720) {
            this.f194590b = 0;
        } else if (width == 360 || width == 352) {
            this.f194590b = 2;
        } else {
            this.f194590b = 1;
        }
        int i = frameRate < 8 ? 4 : 5;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f194597i, "rw");
            randomAccessFile.seek(this.f194590b * 4);
            randomAccessFile.writeInt(i);
            randomAccessFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m211233e() {
        if (this.f194591c == -1 && this.f194593e) {
            this.f194591c = m211236h();
        }
        return this.f194591c;
    }

    /* JADX INFO: renamed from: f */
    public void m211234f() {
        m211229d();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f194597i, "r");
            for (int i = 0; i < 3; i++) {
                C21353a c21353a = new C21353a(i);
                randomAccessFile.seek(i * 4);
                int i2 = randomAccessFile.readInt();
                if (i2 == 0) {
                    c21353a.f194604b = false;
                    m211231b(c21353a);
                } else if ((i2 & 1) == 1) {
                    c21353a.f194604b = true;
                    c21353a.f194605c = true;
                    m211231b(c21353a);
                    if (this.f194592d) {
                        this.f194590b = i;
                        this.f194592d = false;
                    }
                } else {
                    c21353a.f194605c = false;
                    c21353a.f194604b = true;
                    m211231b(c21353a);
                }
            }
            randomAccessFile.close();
            this.f194595g = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m211235g() {
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = this.f194602n;
        if (videoDataRetrieverBySoft != null) {
            videoDataRetrieverBySoft.release();
            this.f194602n = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public int m211236h() {
        int i;
        if (this.f194594f) {
            int iM211230a = m211230a();
            this.f194590b = iM211230a;
            return iM211230a;
        }
        int i2 = 0;
        while (true) {
            int size = this.f194601m.size();
            List<C21353a> list = this.f194601m;
            if (i2 >= size) {
                int size2 = list.size() - 1;
                this.f194590b = size2;
                this.f194591c = size2;
                this.f194600l = false;
                return 2;
            }
            if (list.get(i2).f194605c) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (!this.f194601m.get(i3).f194604b) {
                        this.f194590b = i3;
                        return i3;
                    }
                }
                this.f194590b = i2;
                this.f194591c = i2;
                return i2;
            }
            if (this.f194601m.get(i2).f194604b && (i = i2 + 1) < this.f194601m.size() && !this.f194601m.get(i).f194604b) {
                this.f194590b = i;
                return i;
            }
            i2++;
        }
    }
}
