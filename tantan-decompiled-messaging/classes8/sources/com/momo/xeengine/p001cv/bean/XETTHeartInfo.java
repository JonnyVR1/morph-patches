package com.momo.xeengine.p001cv.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
@Deprecated
public class XETTHeartInfo extends CVSegmentInfo {
    private List<XETTHeartDataBlock> dataBlocks;

    public List<XETTHeartDataBlock> getDataBlocks() {
        return this.dataBlocks;
    }

    public void setDataBlocks(List<XETTHeartDataBlock> list) {
        this.dataBlocks = list;
    }

    public class XETTHeartDataBlock {
        private float[] alphas;

        /* JADX INFO: renamed from: cx */
        public float f269cx;

        /* JADX INFO: renamed from: cy */
        public float f270cy;
        private float[] distances;
        public float intensity;

        public XETTHeartDataBlock(float f, float f2, float f3) {
            this.f269cx = f;
            this.f270cy = f2;
            this.intensity = f3;
        }

        public float[] getAlphas() {
            return this.alphas;
        }

        public float[] getDistances() {
            return this.distances;
        }

        public void setAlphas(float[] fArr) {
            this.alphas = fArr;
        }

        public void setDistances(float[] fArr) {
            this.distances = fArr;
        }

        public XETTHeartDataBlock() {
        }
    }
}
