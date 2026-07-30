package project.android.imageprocessing.model;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FilterOptions {
    private float amount;
    private float blockSize;
    private String folder;
    private int frameCost;
    private List<HotDanceBean> hotDance;
    private String imageFolderPath;
    private int moCamPullDuration;
    private int moCamPushDuration;
    private float moCamScale;
    private int moCam_CD;
    private int moCam_Cnt;
    private int moCam_T;
    private int moCam_moveT;
    private int moCam_t0;
    private int modelType;
    private String name;
    private int type;

    public class HotDanceBean {
        private float interval;
        private String name;

        public HotDanceBean() {
        }

        public float getInterval() {
            return this.interval;
        }

        public String getName() {
            return this.name;
        }

        public void setInterval(float f) {
            this.interval = f;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public float getAmount() {
        return this.amount;
    }

    public float getBlockSize() {
        return this.blockSize;
    }

    public String getFolder() {
        return this.folder;
    }

    public int getFrameCost() {
        return this.frameCost;
    }

    public List<HotDanceBean> getHotDance() {
        return this.hotDance;
    }

    public String getImageFolderPath() {
        return this.imageFolderPath;
    }

    public int getMoCamPullDuration() {
        return this.moCamPullDuration;
    }

    public int getMoCamPushDuration() {
        return this.moCamPushDuration;
    }

    public float getMoCamScale() {
        return this.moCamScale;
    }

    public int getMoCam_CD() {
        return this.moCam_CD;
    }

    public int getMoCam_Cnt() {
        return this.moCam_Cnt;
    }

    public int getMoCam_T() {
        return this.moCam_T;
    }

    public int getMoCam_moveT() {
        return this.moCam_moveT;
    }

    public int getMoCam_t0() {
        return this.moCam_t0;
    }

    public int getModelType() {
        return this.modelType;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public void setAmount(float f) {
        this.amount = f;
    }

    public void setBlockSize(float f) {
        this.blockSize = f;
    }

    public void setFolder(String str) {
        this.folder = str;
    }

    public void setFrameCost(int i) {
        this.frameCost = i;
    }

    public void setHotDance(List<HotDanceBean> list) {
        this.hotDance = list;
    }

    public void setImageFolderPath(String str) {
        this.imageFolderPath = str;
    }

    public void setMoCamPullDuration(int i) {
        this.moCamPullDuration = i;
    }

    public void setMoCamPushDuration(int i) {
        this.moCamPushDuration = i;
    }

    public void setMoCamScale(float f) {
        this.moCamScale = f;
    }

    public void setMoCam_CD(int i) {
        this.moCam_CD = i;
    }

    public void setMoCam_Cnt(int i) {
        this.moCam_Cnt = i;
    }

    public void setMoCam_T(int i) {
        this.moCam_T = i;
    }

    public void setMoCam_moveT(int i) {
        this.moCam_moveT = i;
    }

    public void setMoCam_t0(int i) {
        this.moCam_t0 = i;
    }

    public void setModelType(int i) {
        this.modelType = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "FilterOptions{, modelType=" + this.modelType + ", frameCost=" + this.frameCost + ", amount=" + this.amount + ", blockSize=" + this.blockSize + ", type=" + this.type + ", moCamPushDuration=" + this.moCamPushDuration + ", moCamPullDuration=" + this.moCamPullDuration + ", moCamScale=" + this.moCamScale + ", moCam_T=" + this.moCam_T + ", moCam_t0=" + this.moCam_t0 + ", moCam_CD=" + this.moCam_CD + ", moCam_Cnt=" + this.moCam_Cnt + ", moCam_moveT=" + this.moCam_moveT + '}';
    }
}
