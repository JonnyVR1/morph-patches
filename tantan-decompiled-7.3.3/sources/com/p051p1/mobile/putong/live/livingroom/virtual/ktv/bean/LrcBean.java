package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class LrcBean {
    public List<Tone> tones;

    public enum Lang {
        Chinese,
        English
    }

    public static class Tone {
        public long begin;
        public long end;
        public String fullText;
        public boolean isTitle;
        public Lang lang = Lang.Chinese;
        public int pitch = 0;
        public String word;

        public long getDuration() {
            return this.end - this.begin;
        }
    }

    public LrcBean(Tone tone) {
        ArrayList arrayList = new ArrayList();
        this.tones = arrayList;
        arrayList.add(tone);
    }

    public long getStartTime() {
        List<Tone> list = this.tones;
        if (list == null || list.size() <= 0) {
            return 0L;
        }
        return this.tones.get(0).begin;
    }

    public LrcBean() {
        this.tones = new ArrayList();
    }

    public LrcBean(List<Tone> list) {
        this.tones = list;
    }
}
