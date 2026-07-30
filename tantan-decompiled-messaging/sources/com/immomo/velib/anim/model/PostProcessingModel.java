package com.immomo.velib.anim.model;

/* JADX INFO: loaded from: classes7.dex */
public class PostProcessingModel {
    private String filterName;
    private ParamsModel params;

    public static class ParamsModel {
        private float contrast;
        private float radius;
        private float saturation;
        private float scale;
        private float threshold;

        public float getContrast() {
            return this.contrast;
        }

        public float getRadius() {
            return this.radius;
        }

        public float getSaturation() {
            return this.saturation;
        }

        public float getScale() {
            return this.scale;
        }

        public float getThreshold() {
            return this.threshold;
        }

        public void setContrast(float f) {
            this.contrast = f;
        }

        public void setRadius(float f) {
            this.radius = f;
        }

        public void setSaturation(float f) {
            this.saturation = f;
        }

        public void setScale(float f) {
            this.scale = f;
        }

        public void setThreshold(float f) {
            this.threshold = f;
        }
    }

    public String getFilterName() {
        return this.filterName;
    }

    public ParamsModel getParams() {
        return this.params;
    }

    public void setFilterName(String str) {
        this.filterName = str;
    }

    public void setParams(ParamsModel paramsModel) {
        this.params = paramsModel;
    }
}
