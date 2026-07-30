package com.immomo.momomediaext.sei;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class BaseSei implements Serializable {
    public static final String CONF = "conf";
    public static final String CTIME = "ctime";
    public static final String CTYPE = "ctyp";
    public static final String EXT = "ext";

    /* JADX INFO: renamed from: H */
    public static final String f14618H = "h";

    /* JADX INFO: renamed from: ID */
    public static final String f14619ID = "id";
    public static final String INFO = "info";
    public static final String INV = "inv";
    public static final String MID = "mid";

    /* JADX INFO: renamed from: MU */
    public static final String f14620MU = "mu";

    /* JADX INFO: renamed from: OL */
    public static final String f14621OL = "ol";
    public static final String ShortSei = "shortSei";

    /* JADX INFO: renamed from: VO */
    public static final String f14622VO = "vo";

    /* JADX INFO: renamed from: W */
    public static final String f14623W = "w";

    /* JADX INFO: renamed from: X */
    public static final String f14624X = "x";

    /* JADX INFO: renamed from: Y */
    public static final String f14625Y = "y";

    /* JADX INFO: renamed from: Z */
    public static final String f14626Z = "z";
    protected CanvasBean canvas;
    protected List<SeiBean> conf;
    protected List<SeiBean> has;
    protected InfoBean info;
    private String ctyp = "";
    private String styp = "";
    private String inv = "";
    private String mid = "";
    private String ext = "";
    private int shortSei = 0;

    public static class CanvasBean implements Serializable {
        private List<Integer> bgrgb;

        /* JADX INFO: renamed from: h */
        private int f14627h;

        /* JADX INFO: renamed from: w */
        private int f14628w;

        public List<Integer> getBgrgb() {
            return this.bgrgb;
        }

        public int getH() {
            return this.f14627h;
        }

        public int getW() {
            return this.f14628w;
        }

        public void setBgrgb(List<Integer> list) {
            this.bgrgb = list;
        }

        public void setH(int i) {
            this.f14627h = i;
        }

        public void setW(int i) {
            this.f14628w = i;
        }
    }

    public static class InfoBean implements Serializable {
        private long ctime = 0;
        private int ctyp;
        private List<SeiBean> cuids;

        /* JADX INFO: renamed from: d */
        private String f14629d;
        private HostconBean hostcon;
        private long inv;
        private List<SeiBean> mfuid;
        private int pkst;
        private PostBean post;
        private List<SeiBean> screens;
        private int styp;
        private String test;
        private VerBean ver;

        public static class AnimalsBean implements Serializable {
            private String aid;
            private String sid;

            public String getAid() {
                return this.aid;
            }

            public String getSid() {
                return this.sid;
            }

            public void setAid(String str) {
                this.aid = str;
            }

            public void setSid(String str) {
                this.sid = str;
            }
        }

        public static class HostconBean implements Serializable {
            private List<SeiBean> screens;

            public List<SeiBean> getScreens() {
                return this.screens;
            }

            public void setScreens(List<SeiBean> list) {
                this.screens = list;
            }
        }

        public static class PostBean implements Serializable {

            /* JADX INFO: renamed from: a */
            private String f14630a;

            /* JADX INFO: renamed from: id */
            private String f14631id;

            /* JADX INFO: renamed from: n */
            private String f14632n;
            private List<SeiBean> screens;

            /* JADX INFO: renamed from: t */
            private String f14633t;

            /* JADX INFO: renamed from: z */
            private int f14634z;

            public String getA() {
                return this.f14630a;
            }

            public String getId() {
                return this.f14631id;
            }

            public String getN() {
                return this.f14632n;
            }

            public List<SeiBean> getScreens() {
                return this.screens;
            }

            public String getT() {
                return this.f14633t;
            }

            public int getZ() {
                return this.f14634z;
            }

            public void setA(String str) {
                this.f14630a = str;
            }

            public void setId(String str) {
                this.f14631id = str;
            }

            public void setN(String str) {
                this.f14632n = str;
            }

            public void setScreens(List<SeiBean> list) {
                this.screens = list;
            }

            public void setT(String str) {
                this.f14633t = str;
            }

            public void setZ(int i) {
                this.f14634z = i;
            }
        }

        public static class VerBean implements Serializable {

            /* JADX INFO: renamed from: ht */
            private int f14635ht;

            /* JADX INFO: renamed from: m */
            private int f14636m;

            /* JADX INFO: renamed from: mf */
            private int f14637mf;

            /* JADX INFO: renamed from: pt */
            private int f14638pt;

            /* JADX INFO: renamed from: sc */
            private int f14639sc;

            public int getHt() {
                return this.f14635ht;
            }

            public int getM() {
                return this.f14636m;
            }

            public int getMf() {
                return this.f14637mf;
            }

            public int getPt() {
                return this.f14638pt;
            }

            public int getSc() {
                return this.f14639sc;
            }

            public void setHt(int i) {
                this.f14635ht = i;
            }

            public void setM(int i) {
                this.f14636m = i;
            }

            public void setMf(int i) {
                this.f14637mf = i;
            }

            public void setPt(int i) {
                this.f14638pt = i;
            }

            public void setSc(int i) {
                this.f14639sc = i;
            }
        }

        public long getCtime() {
            return this.ctime;
        }

        public int getCtyp() {
            return this.ctyp;
        }

        public List<SeiBean> getCuids() {
            if (this.cuids == null) {
                this.cuids = new ArrayList();
            }
            return this.cuids;
        }

        public String getD() {
            return this.f14629d;
        }

        public HostconBean getHostcon() {
            return this.hostcon;
        }

        public long getInv() {
            return this.inv;
        }

        public List<SeiBean> getMfuid() {
            return this.mfuid;
        }

        public int getPkst() {
            return this.pkst;
        }

        public PostBean getPost() {
            return this.post;
        }

        public List<SeiBean> getScreens() {
            return this.screens;
        }

        public int getStyp() {
            return this.styp;
        }

        public String getTest() {
            return this.test;
        }

        public VerBean getVer() {
            return this.ver;
        }

        public void setCtime(long j) {
            this.ctime = j;
        }

        public void setCtyp(int i) {
            this.ctyp = i;
        }

        public void setCuids(List<SeiBean> list) {
            this.cuids = list;
        }

        public void setD(String str) {
            this.f14629d = str;
        }

        public void setHostcon(HostconBean hostconBean) {
            this.hostcon = hostconBean;
        }

        public void setInv(long j) {
            this.inv = j;
        }

        public void setMfuid(List<SeiBean> list) {
            this.mfuid = list;
        }

        public void setPkst(int i) {
            this.pkst = i;
        }

        public void setPost(PostBean postBean) {
            this.post = postBean;
        }

        public void setScreens(List<SeiBean> list) {
            this.screens = list;
        }

        public void setStyp(int i) {
            this.styp = i;
        }

        public void setTest(String str) {
            this.test = str;
        }

        public void setVer(VerBean verBean) {
            this.ver = verBean;
        }
    }

    public static class SeiBean implements Serializable {

        /* JADX INFO: renamed from: id */
        private String f14641id;

        /* JADX INFO: renamed from: mu */
        private int f14642mu;

        /* JADX INFO: renamed from: ol */
        private int f14643ol;
        private String renderMode;

        /* JADX INFO: renamed from: x */
        private float f14646x = 0.0f;

        /* JADX INFO: renamed from: y */
        private float f14647y = 0.0f;

        /* JADX INFO: renamed from: w */
        private float f14645w = 1.0f;

        /* JADX INFO: renamed from: h */
        private float f14640h = 1.0f;

        /* JADX INFO: renamed from: z */
        private int f14648z = 0;
        private int alpha = 1;

        /* JADX INFO: renamed from: vo */
        private float f14644vo = 1.0f;
        private int pkmu = 0;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SeiBean seiBean = (SeiBean) obj;
            return this.f14641id.equalsIgnoreCase(seiBean.f14641id) && this.f14646x == seiBean.f14646x && this.f14647y == seiBean.f14647y && this.f14645w == seiBean.f14645w && this.f14640h == seiBean.f14640h;
        }

        public int getAlpha() {
            return this.alpha;
        }

        public float getH() {
            return this.f14640h;
        }

        public String getId() {
            return this.f14641id;
        }

        public int getMu() {
            return this.f14642mu;
        }

        public int getOl() {
            return this.f14643ol;
        }

        public int getPkmu() {
            return this.pkmu;
        }

        public String getRenderMode() {
            return this.renderMode;
        }

        public float getVo() {
            return this.f14644vo;
        }

        public float getW() {
            return this.f14645w;
        }

        public float getX() {
            return this.f14646x;
        }

        public float getY() {
            return this.f14647y;
        }

        public int getZ() {
            return this.f14648z;
        }

        public void setAlpha(int i) {
            this.alpha = i;
        }

        public void setH(float f) {
            this.f14640h = f;
        }

        public void setId(String str) {
            this.f14641id = str;
        }

        public void setMu(int i) {
            this.f14642mu = i;
        }

        public void setOl(int i) {
            this.f14643ol = i;
        }

        public void setPkmu(int i) {
            this.pkmu = i;
        }

        public void setRenderMode(String str) {
            this.renderMode = str;
        }

        public void setVo(float f) {
            this.f14644vo = f;
        }

        public void setW(float f) {
            this.f14645w = f;
        }

        public void setX(float f) {
            this.f14646x = f;
        }

        public void setY(float f) {
            this.f14647y = f;
        }

        public void setZ(int i) {
            this.f14648z = i;
        }
    }

    public CanvasBean getCanvas() {
        if (this.canvas == null) {
            this.canvas = new CanvasBean();
        }
        return this.canvas;
    }

    public List<SeiBean> getConf() {
        if (this.conf == null) {
            this.conf = new ArrayList();
        }
        return this.conf;
    }

    public String getCtyp() {
        return this.ctyp;
    }

    public String getExt() {
        return this.ext;
    }

    public List<SeiBean> getHas() {
        if (this.has == null) {
            this.has = new ArrayList();
        }
        return this.has;
    }

    public InfoBean getInfo() {
        if (this.info == null) {
            this.info = new InfoBean();
        }
        return this.info;
    }

    public String getInv() {
        return this.inv;
    }

    public String getMid() {
        return this.mid;
    }

    public int getShortSei() {
        return this.shortSei;
    }

    public void setCtyp(String str) {
        this.ctyp = str;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setInv(String str) {
        this.inv = str;
    }

    public void setMid(String str) {
        this.mid = str;
    }

    public void setShortSei(int i) {
        this.shortSei = i;
    }

    public void setStyp(String str) {
        this.styp = str;
    }
}
