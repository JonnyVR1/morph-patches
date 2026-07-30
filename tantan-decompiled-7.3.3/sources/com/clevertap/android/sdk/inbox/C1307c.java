package com.clevertap.android.sdk.inbox;

import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.icc0;
import p153l.p2d0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.c */
/* JADX INFO: loaded from: classes.dex */
class C1307c extends C1308d {

    /* JADX INFO: renamed from: r */
    private final RelativeLayout f5354r;

    /* JADX INFO: renamed from: s */
    private final Button f5355s;

    /* JADX INFO: renamed from: t */
    private final Button f5356t;

    /* JADX INFO: renamed from: u */
    private final Button f5357u;

    /* JADX INFO: renamed from: v */
    private final LinearLayout f5358v;

    /* JADX INFO: renamed from: w */
    private final ImageView f5359w;

    /* JADX INFO: renamed from: x */
    private final TextView f5360x;

    /* JADX INFO: renamed from: y */
    private final TextView f5361y;

    /* JADX INFO: renamed from: z */
    private final TextView f5362z;

    public C1307c(@NonNull View view) {
        super(view);
        view.setTag(this);
        this.f5360x = (TextView) view.findViewById(icc0.f114313F0);
        this.f5361y = (TextView) view.findViewById(icc0.f114311E0);
        this.f5367e = (ImageView) view.findViewById(icc0.f114307C0);
        this.f5359w = (ImageView) view.findViewById(icc0.f114358f0);
        this.f5362z = (TextView) view.findViewById(icc0.f114333P0);
        this.f5355s = (Button) view.findViewById(icc0.f114375o);
        this.f5356t = (Button) view.findViewById(icc0.f114377p);
        this.f5357u = (Button) view.findViewById(icc0.f114379q);
        this.f5366d = (FrameLayout) view.findViewById(icc0.f114350b0);
        this.f5368f = (ImageView) view.findViewById(icc0.f114329N0);
        this.f5369g = (ImageView) view.findViewById(icc0.f114385t);
        this.f5354r = (RelativeLayout) view.findViewById(icc0.f114353d);
        this.f5358v = (LinearLayout) view.findViewById(icc0.f114381r);
        this.f5371i = (FrameLayout) view.findViewById(icc0.f114352c0);
        this.f5370h = (RelativeLayout) view.findViewById(icc0.f114309D0);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x06fb A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0705 A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x070f A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x071e A[Catch: NoClassDefFoundError -> 0x08d8, TRY_LEAVE, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0784 A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x078a A[Catch: NoClassDefFoundError -> 0x08d8, TRY_LEAVE, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x07f8 A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x07fe A[Catch: NoClassDefFoundError -> 0x08d8, TRY_LEAVE, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0810 A[Catch: NoClassDefFoundError -> 0x08d8, TRY_ENTER, TRY_LEAVE, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x086d A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x087f A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0897 A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x089d A[Catch: NoClassDefFoundError -> 0x08d8, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x08c0 A[Catch: NoClassDefFoundError -> 0x08d8, TRY_LEAVE, TryCatch #6 {NoClassDefFoundError -> 0x08d8, blocks: (B:42:0x02fd, B:48:0x0314, B:50:0x031a, B:52:0x0324, B:53:0x032d, B:55:0x0333, B:56:0x0345, B:58:0x037d, B:59:0x0399, B:61:0x039f, B:62:0x03b1, B:64:0x03ed, B:65:0x040d, B:67:0x0413, B:69:0x0423, B:72:0x042f, B:74:0x043a, B:76:0x0475, B:73:0x0435, B:77:0x048e, B:80:0x04a0, B:82:0x04ab, B:84:0x04bc, B:81:0x04a6, B:85:0x04d5, B:87:0x04db, B:89:0x04fe, B:123:0x06fb, B:125:0x0705, B:127:0x070f, B:128:0x0718, B:130:0x071e, B:131:0x0730, B:133:0x0768, B:134:0x0784, B:136:0x078a, B:137:0x079c, B:139:0x07d8, B:140:0x07f8, B:142:0x07fe, B:145:0x0810, B:146:0x081a, B:148:0x0852, B:149:0x086d, B:151:0x087f, B:152:0x0897, B:154:0x089d, B:156:0x08c0, B:90:0x0517, B:92:0x051d, B:94:0x0527, B:95:0x0530, B:97:0x0536, B:98:0x0548, B:100:0x0580, B:101:0x059c, B:103:0x05a2, B:104:0x05b4, B:106:0x05f0, B:107:0x0610, B:109:0x0616, B:111:0x0626, B:112:0x0632, B:114:0x066a, B:115:0x0686, B:117:0x06a0, B:118:0x06b9, B:120:0x06bf, B:122:0x06e2), top: B:199:0x02fd, inners: #1, #2, #3, #4, #5, #8, #11, #13, #15 }] */
    @Override // com.clevertap.android.sdk.inbox.C1308d
    /* JADX INFO: renamed from: f */
    public void mo6788f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int iM5976s;
        boolean zIsEmpty;
        ImageView imageView;
        int iM5976s2;
        CTInboxMessageContent cTInboxMessageContent;
        super.mo6788f(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragmentM6799i = m6799i();
        CTInboxMessageContent cTInboxMessageContent2 = null;
        CTInboxMessageContent cTInboxMessageContent3 = cTInboxMessage.m6736d().get(0);
        this.f5360x.setText(cTInboxMessageContent3.m6765s());
        this.f5360x.setTextColor(Color.parseColor(cTInboxMessageContent3.m6766t()));
        this.f5361y.setText(cTInboxMessageContent3.m6762p());
        this.f5361y.setTextColor(Color.parseColor(cTInboxMessageContent3.m6763q()));
        this.f5354r.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5362z.setText(m6797e(cTInboxMessage.m6735c()));
        this.f5362z.setTextColor(Color.parseColor(cTInboxMessageContent3.m6766t()));
        boolean zM6742k = cTInboxMessage.m6742k();
        ImageView imageView2 = this.f5379q;
        if (zM6742k) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
        }
        this.f5366d.setVisibility(8);
        JSONArray jSONArrayM6758l = cTInboxMessageContent3.m6758l();
        LinearLayout linearLayout = this.f5358v;
        if (jSONArrayM6758l != null) {
            linearLayout.setVisibility(0);
            int length = jSONArrayM6758l.length();
            try {
                if (length != 1) {
                    try {
                        if (length != 2) {
                            if (length == 3) {
                                try {
                                    JSONObject jSONObject = jSONArrayM6758l.getJSONObject(0);
                                    this.f5355s.setVisibility(0);
                                    this.f5355s.setText(cTInboxMessageContent3.m6756i(jSONObject));
                                    this.f5355s.setTextColor(Color.parseColor(cTInboxMessageContent3.m6753f(jSONObject)));
                                    this.f5355s.setBackgroundColor(Color.parseColor(cTInboxMessageContent3.m6752e(jSONObject)));
                                    JSONObject jSONObject2 = jSONArrayM6758l.getJSONObject(1);
                                    this.f5356t.setVisibility(0);
                                    this.f5356t.setText(cTInboxMessageContent3.m6756i(jSONObject2));
                                    this.f5356t.setTextColor(Color.parseColor(cTInboxMessageContent3.m6753f(jSONObject2)));
                                    this.f5356t.setBackgroundColor(Color.parseColor(cTInboxMessageContent3.m6752e(jSONObject2)));
                                    JSONObject jSONObject3 = jSONArrayM6758l.getJSONObject(2);
                                    this.f5357u.setVisibility(0);
                                    this.f5357u.setText(cTInboxMessageContent3.m6756i(jSONObject3));
                                    this.f5357u.setTextColor(Color.parseColor(cTInboxMessageContent3.m6753f(jSONObject3)));
                                    this.f5357u.setBackgroundColor(Color.parseColor(cTInboxMessageContent3.m6752e(jSONObject3)));
                                    if (cTInboxListViewFragmentM6799i != null) {
                                        Button button = this.f5355s;
                                        try {
                                            cTInboxMessageContent = cTInboxMessageContent3;
                                            str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                                            button.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button.getText().toString(), jSONObject, cTInboxListViewFragmentM6799i, false, 0));
                                            Button button2 = this.f5356t;
                                            button2.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button2.getText().toString(), jSONObject2, cTInboxListViewFragmentM6799i, false, 1));
                                            Button button3 = this.f5357u;
                                            button3.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button3.getText().toString(), jSONObject3, cTInboxListViewFragmentM6799i, false, 2));
                                            cTInboxMessageContent2 = cTInboxMessageContent;
                                        } catch (JSONException e) {
                                            e = e;
                                            str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                                            cTInboxMessageContent = cTInboxMessageContent3;
                                            cTInboxMessageContent2 = cTInboxMessageContent;
                                            Logger.m5919d("Error parsing CTA JSON - " + e.getLocalizedMessage());
                                        }
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                    str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                                    cTInboxMessageContent = cTInboxMessageContent3;
                                }
                            }
                            str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                            cTInboxMessageContent2 = cTInboxMessageContent3;
                        } else {
                            str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                            cTInboxMessageContent = cTInboxMessageContent3;
                            JSONObject jSONObject4 = jSONArrayM6758l.getJSONObject(0);
                            this.f5355s.setVisibility(0);
                            cTInboxMessageContent2 = cTInboxMessageContent;
                            this.f5355s.setText(cTInboxMessageContent2.m6756i(jSONObject4));
                            this.f5355s.setTextColor(Color.parseColor(cTInboxMessageContent2.m6753f(jSONObject4)));
                            this.f5355s.setBackgroundColor(Color.parseColor(cTInboxMessageContent2.m6752e(jSONObject4)));
                            JSONObject jSONObject5 = jSONArrayM6758l.getJSONObject(1);
                            this.f5356t.setVisibility(0);
                            this.f5356t.setText(cTInboxMessageContent2.m6756i(jSONObject5));
                            this.f5356t.setTextColor(Color.parseColor(cTInboxMessageContent2.m6753f(jSONObject5)));
                            this.f5356t.setBackgroundColor(Color.parseColor(cTInboxMessageContent2.m6752e(jSONObject5)));
                            m6800j(this.f5355s, this.f5356t, this.f5357u);
                            if (cTInboxListViewFragmentM6799i != null) {
                                Button button4 = this.f5355s;
                                button4.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button4.getText().toString(), jSONObject4, cTInboxListViewFragmentM6799i, false, 0));
                                Button button5 = this.f5356t;
                                button5.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button5.getText().toString(), jSONObject5, cTInboxListViewFragmentM6799i, false, 1));
                            }
                        }
                    } catch (JSONException e3) {
                        e = e3;
                    }
                    i2 = 8;
                } else {
                    cTInboxMessageContent2 = cTInboxMessageContent3;
                    str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                    JSONObject jSONObject6 = jSONArrayM6758l.getJSONObject(0);
                    this.f5355s.setVisibility(0);
                    this.f5355s.setText(cTInboxMessageContent2.m6756i(jSONObject6));
                    this.f5355s.setTextColor(Color.parseColor(cTInboxMessageContent2.m6753f(jSONObject6)));
                    this.f5355s.setBackgroundColor(Color.parseColor(cTInboxMessageContent2.m6752e(jSONObject6)));
                    m6801k(this.f5355s, this.f5356t, this.f5357u);
                    if (cTInboxListViewFragmentM6799i != null) {
                        Button button6 = this.f5355s;
                        button6.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button6.getText().toString(), jSONObject6, cTInboxListViewFragmentM6799i, false, 0));
                    }
                }
            } catch (JSONException e4) {
                e = e4;
            }
            i2 = 8;
        } else {
            str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
            cTInboxMessageContent2 = cTInboxMessageContent3;
            i2 = 8;
            linearLayout.setVisibility(8);
        }
        this.f5367e.setVisibility(i2);
        this.f5367e.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5368f.setVisibility(i2);
        this.f5368f.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5369g.setVisibility(i2);
        this.f5369g.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5369g.setContentDescription(null);
        this.f5370h.setVisibility(i2);
        this.f5371i.setVisibility(i2);
        try {
            String strM6738f = cTInboxMessage.m6738f();
            int iHashCode = strM6738f.hashCode();
            if (iHashCode != 108) {
                if (iHashCode == 112 && strM6738f.equals("p")) {
                    if (!TextUtils.isEmpty(cTInboxMessageContent2.m6761o())) {
                        this.f5368f.setContentDescription(cTInboxMessageContent2.m6761o());
                    }
                    if (cTInboxMessageContent2.m6771z()) {
                        this.f5370h.setVisibility(0);
                        this.f5368f.setVisibility(0);
                        this.f5368f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156821t(cTInboxMessageContent2.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5368f);
                        } catch (NoSuchMethodError unused) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156821t(cTInboxMessageContent2.m6760n()).m95652x0(this.f5368f);
                        }
                    } else if (cTInboxMessageContent2.m6770y()) {
                        this.f5370h.setVisibility(0);
                        this.f5368f.setVisibility(0);
                        this.f5368f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156814m().m95642D0(cTInboxMessageContent2.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5368f);
                        } catch (NoSuchMethodError unused2) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156814m().m95642D0(cTInboxMessageContent2.m6760n()).m95652x0(this.f5368f);
                        }
                    } else if (cTInboxMessageContent2.m6747B()) {
                        this.f5370h.setVisibility(0);
                        if (cTInboxMessageContent2.m6764r().isEmpty()) {
                            this.f5370h.setVisibility(0);
                            this.f5368f.setVisibility(0);
                            int i5 = CTInboxActivity.f5293k;
                            ImageView imageView3 = this.f5368f;
                            if (i5 == 2) {
                                imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            this.f5368f.setBackgroundColor(m6798g());
                            int iM5976s3 = Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL);
                            if (iM5976s3 != -1) {
                                ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156820s(Integer.valueOf(iM5976s3)).m95652x0(this.f5368f);
                            }
                        } else {
                            this.f5368f.setVisibility(0);
                            int i6 = CTInboxActivity.f5293k;
                            ImageView imageView4 = this.f5368f;
                            if (i6 == 2) {
                                imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            try {
                                Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156821t(cTInboxMessageContent2.m6764r()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL)).m155557j(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL))).m95652x0(this.f5368f);
                            } catch (NoSuchMethodError unused3) {
                                ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156821t(cTInboxMessageContent2.m6764r()).m95652x0(this.f5368f);
                            }
                        }
                    } else if (cTInboxMessageContent2.m6769x()) {
                        this.f5370h.setVisibility(0);
                        this.f5368f.setVisibility(0);
                        this.f5368f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f5368f.setBackgroundColor(m6798g());
                        int iM5976s4 = Utils.m5976s(this.f5363a, Constants.AUDIO_THUMBNAIL);
                        if (iM5976s4 != -1) {
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156820s(Integer.valueOf(iM5976s4)).m95652x0(this.f5368f);
                        }
                    }
                } else if (!TextUtils.isEmpty(cTInboxMessageContent2.m6760n())) {
                    if (!TextUtils.isEmpty(cTInboxMessageContent2.m6761o())) {
                        this.f5369g.setContentDescription(cTInboxMessageContent2.m6761o());
                    }
                    if (cTInboxMessageContent2.m6771z()) {
                        this.f5370h.setVisibility(0);
                        this.f5369g.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent2.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5369g);
                        } catch (NoSuchMethodError unused4) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent2.m6760n()).m95652x0(this.f5369g);
                        }
                    } else if (cTInboxMessageContent2.m6770y()) {
                        this.f5370h.setVisibility(0);
                        this.f5369g.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156814m().m95642D0(cTInboxMessageContent2.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5369g);
                        } catch (NoSuchMethodError unused5) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156814m().m95642D0(cTInboxMessageContent2.m6760n()).m95652x0(this.f5369g);
                        }
                    } else if (cTInboxMessageContent2.m6747B()) {
                        this.f5370h.setVisibility(0);
                        zIsEmpty = cTInboxMessageContent2.m6764r().isEmpty();
                        imageView = this.f5369g;
                        if (zIsEmpty) {
                            imageView.setVisibility(0);
                            this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            iM5976s2 = Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL);
                            if (iM5976s2 != -1) {
                                ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156820s(Integer.valueOf(iM5976s2)).m95652x0(this.f5369g);
                            }
                        } else {
                            imageView.setVisibility(0);
                            this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            try {
                                ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent2.m6764r()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL)).m155557j(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL))).m95652x0(this.f5369g);
                            } catch (NoSuchMethodError unused6) {
                                Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent2.m6764r()).m95652x0(this.f5369g);
                            }
                        }
                    } else if (cTInboxMessageContent2.m6769x()) {
                        this.f5370h.setVisibility(0);
                        this.f5369g.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f5369g.setBackgroundColor(m6798g());
                        iM5976s = Utils.m5976s(this.f5363a, Constants.AUDIO_THUMBNAIL);
                        if (iM5976s != -1) {
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156820s(Integer.valueOf(iM5976s)).m95652x0(this.f5369g);
                        }
                    }
                }
            } else if (strM6738f.equals(BLiveStormDanmakuGiftResourceType.f45292l)) {
                if (!TextUtils.isEmpty(cTInboxMessageContent2.m6761o())) {
                    this.f5367e.setContentDescription(cTInboxMessageContent2.m6761o());
                }
                if (cTInboxMessageContent2.m6771z()) {
                    this.f5370h.setVisibility(0);
                    this.f5367e.setVisibility(0);
                    this.f5367e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    try {
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156821t(cTInboxMessageContent2.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5367e);
                    } catch (NoSuchMethodError unused7) {
                        Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156821t(cTInboxMessageContent2.m6760n()).m95652x0(this.f5367e);
                    }
                } else if (cTInboxMessageContent2.m6770y()) {
                    this.f5370h.setVisibility(0);
                    this.f5367e.setVisibility(0);
                    this.f5367e.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    try {
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156814m().m95642D0(cTInboxMessageContent2.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5367e);
                    } catch (NoSuchMethodError unused8) {
                        Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156814m().m95642D0(cTInboxMessageContent2.m6760n()).m95652x0(this.f5367e);
                    }
                } else if (cTInboxMessageContent2.m6747B()) {
                    this.f5370h.setVisibility(0);
                    if (cTInboxMessageContent2.m6764r().isEmpty()) {
                        this.f5370h.setVisibility(0);
                        this.f5367e.setVisibility(0);
                        this.f5367e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int iM5976s5 = Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL);
                        if (iM5976s5 != -1) {
                            ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156820s(Integer.valueOf(iM5976s5)).m95652x0(this.f5367e);
                        }
                    } else {
                        this.f5367e.setVisibility(0);
                        this.f5367e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156821t(cTInboxMessageContent2.m6764r()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL)).m155557j(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL))).m95652x0(this.f5367e);
                        } catch (NoSuchMethodError unused9) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156821t(cTInboxMessageContent2.m6764r()).m95652x0(this.f5367e);
                        }
                    }
                } else if (cTInboxMessageContent2.m6769x()) {
                    this.f5370h.setVisibility(0);
                    this.f5367e.setVisibility(0);
                    this.f5367e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.f5367e.setBackgroundColor(m6798g());
                    int iM5976s6 = Utils.m5976s(this.f5363a, Constants.AUDIO_THUMBNAIL);
                    if (iM5976s6 != -1) {
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156820s(Integer.valueOf(iM5976s6)).m95652x0(this.f5367e);
                    }
                }
            } else if (!TextUtils.isEmpty(cTInboxMessageContent2.m6760n())) {
                if (!TextUtils.isEmpty(cTInboxMessageContent2.m6761o())) {
                    this.f5369g.setContentDescription(cTInboxMessageContent2.m6761o());
                }
                if (cTInboxMessageContent2.m6771z()) {
                    this.f5370h.setVisibility(0);
                    this.f5369g.setVisibility(0);
                    this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent2.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5369g);
                } else if (cTInboxMessageContent2.m6770y()) {
                    this.f5370h.setVisibility(0);
                    this.f5369g.setVisibility(0);
                    this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156814m().m95642D0(cTInboxMessageContent2.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5369g);
                } else if (cTInboxMessageContent2.m6747B()) {
                    this.f5370h.setVisibility(0);
                    zIsEmpty = cTInboxMessageContent2.m6764r().isEmpty();
                    imageView = this.f5369g;
                    if (zIsEmpty) {
                        imageView.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent2.m6764r()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL)).m155557j(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL))).m95652x0(this.f5369g);
                    } else {
                        imageView.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        iM5976s2 = Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL);
                        if (iM5976s2 != -1) {
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156820s(Integer.valueOf(iM5976s2)).m95652x0(this.f5369g);
                        }
                    }
                } else if (cTInboxMessageContent2.m6769x()) {
                    this.f5370h.setVisibility(0);
                    this.f5369g.setVisibility(0);
                    this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    this.f5369g.setBackgroundColor(m6798g());
                    iM5976s = Utils.m5976s(this.f5363a, Constants.AUDIO_THUMBNAIL);
                    if (iM5976s != -1) {
                        ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156820s(Integer.valueOf(iM5976s)).m95652x0(this.f5369g);
                    }
                }
            }
        } catch (NoClassDefFoundError unused10) {
            Logger.m5919d(str);
        }
        Resources resources = this.f5363a.getResources();
        if (CTInboxActivity.f5293k == 2) {
            i3 = resources.getDisplayMetrics().heightPixels / 2;
            i4 = resources.getDisplayMetrics().widthPixels / 2;
        } else {
            i3 = resources.getDisplayMetrics().widthPixels;
            if (!cTInboxMessage.m6738f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f45292l) && cTInboxMessage.m6738f().equalsIgnoreCase("p")) {
                i4 = i3;
            } else {
                int iRound = Math.round(i3 * 0.5625f);
                i3 = iRound;
                i4 = i3;
            }
        }
        this.f5371i.setLayoutParams(new RelativeLayout.LayoutParams(i4, i3));
        m6802l(cTInboxMessage, i);
        try {
            boolean zIsEmpty2 = cTInboxMessageContent2.m6750c().isEmpty();
            ImageView imageView5 = this.f5359w;
            if (zIsEmpty2) {
                imageView5.setVisibility(8);
            } else {
                imageView5.setVisibility(0);
                if (!cTInboxMessageContent2.m6751d().isEmpty()) {
                    this.f5359w.setContentDescription(cTInboxMessageContent2.m6751d());
                }
                try {
                    ComponentCallbacks2C1057a.m5325t(this.f5359w.getContext()).m156821t(cTInboxMessageContent2.m6750c()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5359w);
                } catch (NoSuchMethodError unused11) {
                    Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                    ComponentCallbacks2C1057a.m5325t(this.f5359w.getContext()).m156821t(cTInboxMessageContent2.m6750c()).m95652x0(this.f5359w);
                }
            }
        } catch (NoClassDefFoundError unused12) {
            Logger.m5919d(str);
        }
        if (cTInboxListViewFragmentM6799i != null) {
            this.f5354r.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, (String) null, (JSONObject) null, cTInboxListViewFragmentM6799i, true, -1));
        }
    }
}
