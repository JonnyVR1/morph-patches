package p149l;

import android.content.Context;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.mediautils.VideoDataRetrieverBySoft;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class tal0 {

    /* JADX INFO: renamed from: h */
    private String f169135h;

    /* JADX INFO: renamed from: i */
    private String f169136i;

    /* JADX INFO: renamed from: j */
    private c5k f169137j;

    /* JADX INFO: renamed from: a */
    private final String f169128a = "VideoResolutionSelector";

    /* JADX INFO: renamed from: b */
    private int f169129b = -1;

    /* JADX INFO: renamed from: c */
    private int f169130c = -1;

    /* JADX INFO: renamed from: d */
    private boolean f169131d = true;

    /* JADX INFO: renamed from: e */
    private boolean f169132e = true;

    /* JADX INFO: renamed from: f */
    private boolean f169133f = true;

    /* JADX INFO: renamed from: g */
    private boolean f169134g = false;

    /* JADX INFO: renamed from: k */
    private int f169138k = -1;

    /* JADX INFO: renamed from: l */
    private boolean f169139l = true;

    /* JADX INFO: renamed from: m */
    private List<C20134a> f169140m = new ArrayList();

    /* JADX INFO: renamed from: n */
    private VideoDataRetrieverBySoft f169141n = null;

    /* JADX INFO: renamed from: l.tal0$a */
    public class C20134a {

        /* JADX INFO: renamed from: a */
        public int f169142a;

        /* JADX INFO: renamed from: b */
        public boolean f169143b = false;

        /* JADX INFO: renamed from: c */
        public boolean f169144c = false;

        public C20134a(int i) {
            this.f169142a = i;
        }
    }

    public tal0(String str, Context context) {
        this.f169135h = str;
        this.f169136i = this.f169135h + "Res_2017_10-10.ini";
        if (this.f169137j == null && context != null) {
            this.f169137j = new c5k(context);
        }
        if (this.f169134g) {
            return;
        }
        m187736f();
    }

    /* JADX INFO: renamed from: d */
    private void m187731d() {
        try {
            File file = new File(this.f169135h);
            MDLog.m7395i("VideoResolutionSelector", "path = " + this.f169135h);
            if (!file.exists() || !file.isDirectory()) {
                file.mkdirs();
            }
            if (new File(this.f169135h, "Res_2017_10-10.ini").createNewFile()) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f169136i, "rw");
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
    public int m187732a() {
        c5k c5kVar = this.f169137j;
        int iM105343o = c5kVar != null ? c5kVar.m105343o(true) : 2;
        if (iM105343o == 1) {
            this.f169138k = 0;
            return 0;
        }
        if (iM105343o == 2) {
            this.f169138k = 1;
            return 0;
        }
        if (iM105343o != 3) {
            return 2;
        }
        this.f169138k = 3;
        return 1;
    }

    /* JADX INFO: renamed from: b */
    public void m187733b(C20134a c20134a) {
        boolean z = c20134a.f169143b;
        if (!z) {
            this.f169132e = false;
        }
        if (z) {
            this.f169133f = false;
        }
        this.f169140m.add(c20134a);
    }

    /* JADX INFO: renamed from: c */
    public void m187734c(String str) {
        if (this.f169141n == null) {
            this.f169141n = new VideoDataRetrieverBySoft();
        }
        if (!this.f169141n.init(str)) {
            MDLog.m7391e("VideoResolutionSelect", "Init videodataRetriever failed !");
            return;
        }
        int width = this.f169141n.getWidth();
        int frameRate = this.f169141n.getFrameRate();
        if (width == 720) {
            this.f169129b = 0;
        } else if (width == 360 || width == 352) {
            this.f169129b = 2;
        } else {
            this.f169129b = 1;
        }
        int i = frameRate < 8 ? 4 : 5;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f169136i, "rw");
            randomAccessFile.seek(this.f169129b * 4);
            randomAccessFile.writeInt(i);
            randomAccessFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m187735e() {
        if (this.f169130c == -1 && this.f169132e) {
            this.f169130c = m187738h();
        }
        return this.f169130c;
    }

    /* JADX INFO: renamed from: f */
    public void m187736f() {
        m187731d();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f169136i, "r");
            for (int i = 0; i < 3; i++) {
                C20134a c20134a = new C20134a(i);
                randomAccessFile.seek(i * 4);
                int i2 = randomAccessFile.readInt();
                if (i2 == 0) {
                    c20134a.f169143b = false;
                    m187733b(c20134a);
                } else if ((i2 & 1) == 1) {
                    c20134a.f169143b = true;
                    c20134a.f169144c = true;
                    m187733b(c20134a);
                    if (this.f169131d) {
                        this.f169129b = i;
                        this.f169131d = false;
                    }
                } else {
                    c20134a.f169144c = false;
                    c20134a.f169143b = true;
                    m187733b(c20134a);
                }
            }
            randomAccessFile.close();
            this.f169134g = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m187737g() {
        VideoDataRetrieverBySoft videoDataRetrieverBySoft = this.f169141n;
        if (videoDataRetrieverBySoft != null) {
            videoDataRetrieverBySoft.release();
            this.f169141n = null;
        }
    }

    /* JADX INFO: renamed from: h */
    public int m187738h() {
        int i;
        if (this.f169133f) {
            int iM187732a = m187732a();
            this.f169129b = iM187732a;
            return iM187732a;
        }
        int i2 = 0;
        while (true) {
            int size = this.f169140m.size();
            List<C20134a> list = this.f169140m;
            if (i2 >= size) {
                int size2 = list.size() - 1;
                this.f169129b = size2;
                this.f169130c = size2;
                this.f169139l = false;
                return 2;
            }
            if (list.get(i2).f169144c) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (!this.f169140m.get(i3).f169143b) {
                        this.f169129b = i3;
                        return i3;
                    }
                }
                this.f169129b = i2;
                this.f169130c = i2;
                return i2;
            }
            if (this.f169140m.get(i2).f169143b && (i = i2 + 1) < this.f169140m.size() && !this.f169140m.get(i).f169143b) {
                this.f169129b = i;
                return i;
            }
            i2++;
        }
    }
}
