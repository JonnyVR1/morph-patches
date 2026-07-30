package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopSelectTypeData extends ExpInputContentBaseData {
    public int count;
    public ArrayList<ItemData> list;
    public String text;

    public ExpProfileLoopSelectTypeData(ArrayList<ItemData> arrayList) {
        this.list = arrayList;
    }

    public static class ItemData implements Serializable {
        public boolean boolValue;
        public String key;
        public String text;

        public ItemData(String str, String str2, boolean z) {
            this.text = str2;
            this.key = str;
            this.boolValue = z;
        }

        public ItemData(String str) {
            this.key = "";
            this.text = str;
        }
    }
}
