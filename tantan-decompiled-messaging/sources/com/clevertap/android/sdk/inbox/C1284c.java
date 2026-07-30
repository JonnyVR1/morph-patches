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
import com.bumptech.glide.ComponentCallbacks2C1053a;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.c4c0;
import p149l.muc0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.c */
/* JADX INFO: loaded from: classes.dex */
class C1284c extends C1285d {

    /* JADX INFO: renamed from: r */
    private final RelativeLayout f5317r;

    /* JADX INFO: renamed from: s */
    private final Button f5318s;

    /* JADX INFO: renamed from: t */
    private final Button f5319t;

    /* JADX INFO: renamed from: u */
    private final Button f5320u;

    /* JADX INFO: renamed from: v */
    private final LinearLayout f5321v;

    /* JADX INFO: renamed from: w */
    private final ImageView f5322w;

    /* JADX INFO: renamed from: x */
    private final TextView f5323x;

    /* JADX INFO: renamed from: y */
    private final TextView f5324y;

    /* JADX INFO: renamed from: z */
    private final TextView f5325z;

    public C1284c(@NonNull View view) {
        super(view);
        view.setTag(this);
        this.f5323x = (TextView) view.findViewById(c4c0.f79177F0);
        this.f5324y = (TextView) view.findViewById(c4c0.f79175E0);
        this.f5330e = (ImageView) view.findViewById(c4c0.f79171C0);
        this.f5322w = (ImageView) view.findViewById(c4c0.f79222f0);
        this.f5325z = (TextView) view.findViewById(c4c0.f79197P0);
        this.f5318s = (Button) view.findViewById(c4c0.f79239o);
        this.f5319t = (Button) view.findViewById(c4c0.f79241p);
        this.f5320u = (Button) view.findViewById(c4c0.f79243q);
        this.f5329d = (FrameLayout) view.findViewById(c4c0.f79214b0);
        this.f5331f = (ImageView) view.findViewById(c4c0.f79193N0);
        this.f5332g = (ImageView) view.findViewById(c4c0.f79249t);
        this.f5317r = (RelativeLayout) view.findViewById(c4c0.f79217d);
        this.f5321v = (LinearLayout) view.findViewById(c4c0.f79245r);
        this.f5334i = (FrameLayout) view.findViewById(c4c0.f79216c0);
        this.f5333h = (RelativeLayout) view.findViewById(c4c0.f79173D0);
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
    @Override // com.clevertap.android.sdk.inbox.C1285d
    /* JADX INFO: renamed from: f */
    public void mo6734f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int iM5922s;
        boolean zIsEmpty;
        ImageView imageView;
        int iM5922s2;
        CTInboxMessageContent cTInboxMessageContent;
        super.mo6734f(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragmentM6745i = m6745i();
        CTInboxMessageContent cTInboxMessageContent2 = null;
        CTInboxMessageContent cTInboxMessageContent3 = cTInboxMessage.m6682d().get(0);
        this.f5323x.setText(cTInboxMessageContent3.m6711s());
        this.f5323x.setTextColor(Color.parseColor(cTInboxMessageContent3.m6712t()));
        this.f5324y.setText(cTInboxMessageContent3.m6708p());
        this.f5324y.setTextColor(Color.parseColor(cTInboxMessageContent3.m6709q()));
        this.f5317r.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5325z.setText(m6743e(cTInboxMessage.m6681c()));
        this.f5325z.setTextColor(Color.parseColor(cTInboxMessageContent3.m6712t()));
        boolean zM6688k = cTInboxMessage.m6688k();
        ImageView imageView2 = this.f5342q;
        if (zM6688k) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
        }
        this.f5329d.setVisibility(8);
        JSONArray jSONArrayM6704l = cTInboxMessageContent3.m6704l();
        LinearLayout linearLayout = this.f5321v;
        if (jSONArrayM6704l != null) {
            linearLayout.setVisibility(0);
            int length = jSONArrayM6704l.length();
            try {
                if (length != 1) {
                    try {
                        if (length != 2) {
                            if (length == 3) {
                                try {
                                    JSONObject jSONObject = jSONArrayM6704l.getJSONObject(0);
                                    this.f5318s.setVisibility(0);
                                    this.f5318s.setText(cTInboxMessageContent3.m6702i(jSONObject));
                                    this.f5318s.setTextColor(Color.parseColor(cTInboxMessageContent3.m6699f(jSONObject)));
                                    this.f5318s.setBackgroundColor(Color.parseColor(cTInboxMessageContent3.m6698e(jSONObject)));
                                    JSONObject jSONObject2 = jSONArrayM6704l.getJSONObject(1);
                                    this.f5319t.setVisibility(0);
                                    this.f5319t.setText(cTInboxMessageContent3.m6702i(jSONObject2));
                                    this.f5319t.setTextColor(Color.parseColor(cTInboxMessageContent3.m6699f(jSONObject2)));
                                    this.f5319t.setBackgroundColor(Color.parseColor(cTInboxMessageContent3.m6698e(jSONObject2)));
                                    JSONObject jSONObject3 = jSONArrayM6704l.getJSONObject(2);
                                    this.f5320u.setVisibility(0);
                                    this.f5320u.setText(cTInboxMessageContent3.m6702i(jSONObject3));
                                    this.f5320u.setTextColor(Color.parseColor(cTInboxMessageContent3.m6699f(jSONObject3)));
                                    this.f5320u.setBackgroundColor(Color.parseColor(cTInboxMessageContent3.m6698e(jSONObject3)));
                                    if (cTInboxListViewFragmentM6745i != null) {
                                        Button button = this.f5318s;
                                        try {
                                            cTInboxMessageContent = cTInboxMessageContent3;
                                            str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                                            button.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button.getText().toString(), jSONObject, cTInboxListViewFragmentM6745i, false, 0));
                                            Button button2 = this.f5319t;
                                            button2.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button2.getText().toString(), jSONObject2, cTInboxListViewFragmentM6745i, false, 1));
                                            Button button3 = this.f5320u;
                                            button3.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button3.getText().toString(), jSONObject3, cTInboxListViewFragmentM6745i, false, 2));
                                            cTInboxMessageContent2 = cTInboxMessageContent;
                                        } catch (JSONException e) {
                                            e = e;
                                            str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                                            cTInboxMessageContent = cTInboxMessageContent3;
                                            cTInboxMessageContent2 = cTInboxMessageContent;
                                            Logger.m5865d("Error parsing CTA JSON - " + e.getLocalizedMessage());
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
                            JSONObject jSONObject4 = jSONArrayM6704l.getJSONObject(0);
                            this.f5318s.setVisibility(0);
                            cTInboxMessageContent2 = cTInboxMessageContent;
                            this.f5318s.setText(cTInboxMessageContent2.m6702i(jSONObject4));
                            this.f5318s.setTextColor(Color.parseColor(cTInboxMessageContent2.m6699f(jSONObject4)));
                            this.f5318s.setBackgroundColor(Color.parseColor(cTInboxMessageContent2.m6698e(jSONObject4)));
                            JSONObject jSONObject5 = jSONArrayM6704l.getJSONObject(1);
                            this.f5319t.setVisibility(0);
                            this.f5319t.setText(cTInboxMessageContent2.m6702i(jSONObject5));
                            this.f5319t.setTextColor(Color.parseColor(cTInboxMessageContent2.m6699f(jSONObject5)));
                            this.f5319t.setBackgroundColor(Color.parseColor(cTInboxMessageContent2.m6698e(jSONObject5)));
                            m6746j(this.f5318s, this.f5319t, this.f5320u);
                            if (cTInboxListViewFragmentM6745i != null) {
                                Button button4 = this.f5318s;
                                button4.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button4.getText().toString(), jSONObject4, cTInboxListViewFragmentM6745i, false, 0));
                                Button button5 = this.f5319t;
                                button5.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button5.getText().toString(), jSONObject5, cTInboxListViewFragmentM6745i, false, 1));
                            }
                        }
                    } catch (JSONException e3) {
                        e = e3;
                    }
                    i2 = 8;
                } else {
                    cTInboxMessageContent2 = cTInboxMessageContent3;
                    str = "CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info";
                    JSONObject jSONObject6 = jSONArrayM6704l.getJSONObject(0);
                    this.f5318s.setVisibility(0);
                    this.f5318s.setText(cTInboxMessageContent2.m6702i(jSONObject6));
                    this.f5318s.setTextColor(Color.parseColor(cTInboxMessageContent2.m6699f(jSONObject6)));
                    this.f5318s.setBackgroundColor(Color.parseColor(cTInboxMessageContent2.m6698e(jSONObject6)));
                    m6747k(this.f5318s, this.f5319t, this.f5320u);
                    if (cTInboxListViewFragmentM6745i != null) {
                        Button button6 = this.f5318s;
                        button6.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button6.getText().toString(), jSONObject6, cTInboxListViewFragmentM6745i, false, 0));
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
        this.f5330e.setVisibility(i2);
        this.f5330e.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5331f.setVisibility(i2);
        this.f5331f.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5332g.setVisibility(i2);
        this.f5332g.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5332g.setContentDescription(null);
        this.f5333h.setVisibility(i2);
        this.f5334i.setVisibility(i2);
        try {
            String strM6684f = cTInboxMessage.m6684f();
            int iHashCode = strM6684f.hashCode();
            if (iHashCode != 108) {
                if (iHashCode == 112 && strM6684f.equals("p")) {
                    if (!TextUtils.isEmpty(cTInboxMessageContent2.m6707o())) {
                        this.f5331f.setContentDescription(cTInboxMessageContent2.m6707o());
                    }
                    if (cTInboxMessageContent2.m6717z()) {
                        this.f5333h.setVisibility(0);
                        this.f5331f.setVisibility(0);
                        this.f5331f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143276t(cTInboxMessageContent2.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5331f);
                        } catch (NoSuchMethodError unused) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143276t(cTInboxMessageContent2.m6706n()).m199993w0(this.f5331f);
                        }
                    } else if (cTInboxMessageContent2.m6716y()) {
                        this.f5333h.setVisibility(0);
                        this.f5331f.setVisibility(0);
                        this.f5331f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143269m().m199985B0(cTInboxMessageContent2.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5331f);
                        } catch (NoSuchMethodError unused2) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143269m().m199985B0(cTInboxMessageContent2.m6706n()).m199993w0(this.f5331f);
                        }
                    } else if (cTInboxMessageContent2.m6693B()) {
                        this.f5333h.setVisibility(0);
                        if (cTInboxMessageContent2.m6710r().isEmpty()) {
                            this.f5333h.setVisibility(0);
                            this.f5331f.setVisibility(0);
                            int i5 = CTInboxActivity.f5256k;
                            ImageView imageView3 = this.f5331f;
                            if (i5 == 2) {
                                imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            this.f5331f.setBackgroundColor(m6744g());
                            int iM5922s3 = Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL);
                            if (iM5922s3 != -1) {
                                ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143275s(Integer.valueOf(iM5922s3)).m199993w0(this.f5331f);
                            }
                        } else {
                            this.f5331f.setVisibility(0);
                            int i6 = CTInboxActivity.f5256k;
                            ImageView imageView4 = this.f5331f;
                            if (i6 == 2) {
                                imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            try {
                                Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143276t(cTInboxMessageContent2.m6710r()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL)).m199430j(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL))).m199993w0(this.f5331f);
                            } catch (NoSuchMethodError unused3) {
                                ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143276t(cTInboxMessageContent2.m6710r()).m199993w0(this.f5331f);
                            }
                        }
                    } else if (cTInboxMessageContent2.m6715x()) {
                        this.f5333h.setVisibility(0);
                        this.f5331f.setVisibility(0);
                        this.f5331f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f5331f.setBackgroundColor(m6744g());
                        int iM5922s4 = Utils.m5922s(this.f5326a, Constants.AUDIO_THUMBNAIL);
                        if (iM5922s4 != -1) {
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143275s(Integer.valueOf(iM5922s4)).m199993w0(this.f5331f);
                        }
                    }
                } else if (!TextUtils.isEmpty(cTInboxMessageContent2.m6706n())) {
                    if (!TextUtils.isEmpty(cTInboxMessageContent2.m6707o())) {
                        this.f5332g.setContentDescription(cTInboxMessageContent2.m6707o());
                    }
                    if (cTInboxMessageContent2.m6717z()) {
                        this.f5333h.setVisibility(0);
                        this.f5332g.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent2.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5332g);
                        } catch (NoSuchMethodError unused4) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent2.m6706n()).m199993w0(this.f5332g);
                        }
                    } else if (cTInboxMessageContent2.m6716y()) {
                        this.f5333h.setVisibility(0);
                        this.f5332g.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143269m().m199985B0(cTInboxMessageContent2.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5332g);
                        } catch (NoSuchMethodError unused5) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143269m().m199985B0(cTInboxMessageContent2.m6706n()).m199993w0(this.f5332g);
                        }
                    } else if (cTInboxMessageContent2.m6693B()) {
                        this.f5333h.setVisibility(0);
                        zIsEmpty = cTInboxMessageContent2.m6710r().isEmpty();
                        imageView = this.f5332g;
                        if (zIsEmpty) {
                            imageView.setVisibility(0);
                            this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            iM5922s2 = Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL);
                            if (iM5922s2 != -1) {
                                ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143275s(Integer.valueOf(iM5922s2)).m199993w0(this.f5332g);
                            }
                        } else {
                            imageView.setVisibility(0);
                            this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            try {
                                ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent2.m6710r()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL)).m199430j(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL))).m199993w0(this.f5332g);
                            } catch (NoSuchMethodError unused6) {
                                Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent2.m6710r()).m199993w0(this.f5332g);
                            }
                        }
                    } else if (cTInboxMessageContent2.m6715x()) {
                        this.f5333h.setVisibility(0);
                        this.f5332g.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f5332g.setBackgroundColor(m6744g());
                        iM5922s = Utils.m5922s(this.f5326a, Constants.AUDIO_THUMBNAIL);
                        if (iM5922s != -1) {
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143275s(Integer.valueOf(iM5922s)).m199993w0(this.f5332g);
                        }
                    }
                }
            } else if (strM6684f.equals(BLiveStormDanmakuGiftResourceType.f44444l)) {
                if (!TextUtils.isEmpty(cTInboxMessageContent2.m6707o())) {
                    this.f5330e.setContentDescription(cTInboxMessageContent2.m6707o());
                }
                if (cTInboxMessageContent2.m6717z()) {
                    this.f5333h.setVisibility(0);
                    this.f5330e.setVisibility(0);
                    this.f5330e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    try {
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143276t(cTInboxMessageContent2.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5330e);
                    } catch (NoSuchMethodError unused7) {
                        Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143276t(cTInboxMessageContent2.m6706n()).m199993w0(this.f5330e);
                    }
                } else if (cTInboxMessageContent2.m6716y()) {
                    this.f5333h.setVisibility(0);
                    this.f5330e.setVisibility(0);
                    this.f5330e.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    try {
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143269m().m199985B0(cTInboxMessageContent2.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5330e);
                    } catch (NoSuchMethodError unused8) {
                        Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143269m().m199985B0(cTInboxMessageContent2.m6706n()).m199993w0(this.f5330e);
                    }
                } else if (cTInboxMessageContent2.m6693B()) {
                    this.f5333h.setVisibility(0);
                    if (cTInboxMessageContent2.m6710r().isEmpty()) {
                        this.f5333h.setVisibility(0);
                        this.f5330e.setVisibility(0);
                        this.f5330e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int iM5922s5 = Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL);
                        if (iM5922s5 != -1) {
                            ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143275s(Integer.valueOf(iM5922s5)).m199993w0(this.f5330e);
                        }
                    } else {
                        this.f5330e.setVisibility(0);
                        this.f5330e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143276t(cTInboxMessageContent2.m6710r()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL)).m199430j(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL))).m199993w0(this.f5330e);
                        } catch (NoSuchMethodError unused9) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143276t(cTInboxMessageContent2.m6710r()).m199993w0(this.f5330e);
                        }
                    }
                } else if (cTInboxMessageContent2.m6715x()) {
                    this.f5333h.setVisibility(0);
                    this.f5330e.setVisibility(0);
                    this.f5330e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.f5330e.setBackgroundColor(m6744g());
                    int iM5922s6 = Utils.m5922s(this.f5326a, Constants.AUDIO_THUMBNAIL);
                    if (iM5922s6 != -1) {
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143275s(Integer.valueOf(iM5922s6)).m199993w0(this.f5330e);
                    }
                }
            } else if (!TextUtils.isEmpty(cTInboxMessageContent2.m6706n())) {
                if (!TextUtils.isEmpty(cTInboxMessageContent2.m6707o())) {
                    this.f5332g.setContentDescription(cTInboxMessageContent2.m6707o());
                }
                if (cTInboxMessageContent2.m6717z()) {
                    this.f5333h.setVisibility(0);
                    this.f5332g.setVisibility(0);
                    this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent2.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5332g);
                } else if (cTInboxMessageContent2.m6716y()) {
                    this.f5333h.setVisibility(0);
                    this.f5332g.setVisibility(0);
                    this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143269m().m199985B0(cTInboxMessageContent2.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5332g);
                } else if (cTInboxMessageContent2.m6693B()) {
                    this.f5333h.setVisibility(0);
                    zIsEmpty = cTInboxMessageContent2.m6710r().isEmpty();
                    imageView = this.f5332g;
                    if (zIsEmpty) {
                        imageView.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent2.m6710r()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL)).m199430j(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL))).m199993w0(this.f5332g);
                    } else {
                        imageView.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        iM5922s2 = Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL);
                        if (iM5922s2 != -1) {
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143275s(Integer.valueOf(iM5922s2)).m199993w0(this.f5332g);
                        }
                    }
                } else if (cTInboxMessageContent2.m6715x()) {
                    this.f5333h.setVisibility(0);
                    this.f5332g.setVisibility(0);
                    this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    this.f5332g.setBackgroundColor(m6744g());
                    iM5922s = Utils.m5922s(this.f5326a, Constants.AUDIO_THUMBNAIL);
                    if (iM5922s != -1) {
                        ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143275s(Integer.valueOf(iM5922s)).m199993w0(this.f5332g);
                    }
                }
            }
        } catch (NoClassDefFoundError unused10) {
            Logger.m5865d(str);
        }
        Resources resources = this.f5326a.getResources();
        if (CTInboxActivity.f5256k == 2) {
            i3 = resources.getDisplayMetrics().heightPixels / 2;
            i4 = resources.getDisplayMetrics().widthPixels / 2;
        } else {
            i3 = resources.getDisplayMetrics().widthPixels;
            if (!cTInboxMessage.m6684f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f44444l) && cTInboxMessage.m6684f().equalsIgnoreCase("p")) {
                i4 = i3;
            } else {
                int iRound = Math.round(i3 * 0.5625f);
                i3 = iRound;
                i4 = i3;
            }
        }
        this.f5334i.setLayoutParams(new RelativeLayout.LayoutParams(i4, i3));
        m6748l(cTInboxMessage, i);
        try {
            boolean zIsEmpty2 = cTInboxMessageContent2.m6696c().isEmpty();
            ImageView imageView5 = this.f5322w;
            if (zIsEmpty2) {
                imageView5.setVisibility(8);
            } else {
                imageView5.setVisibility(0);
                if (!cTInboxMessageContent2.m6697d().isEmpty()) {
                    this.f5322w.setContentDescription(cTInboxMessageContent2.m6697d());
                }
                try {
                    ComponentCallbacks2C1053a.m5316u(this.f5322w.getContext()).m143276t(cTInboxMessageContent2.m6696c()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5322w);
                } catch (NoSuchMethodError unused11) {
                    Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                    ComponentCallbacks2C1053a.m5316u(this.f5322w.getContext()).m143276t(cTInboxMessageContent2.m6696c()).m199993w0(this.f5322w);
                }
            }
        } catch (NoClassDefFoundError unused12) {
            Logger.m5865d(str);
        }
        if (cTInboxListViewFragmentM6745i != null) {
            this.f5317r.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, (String) null, (JSONObject) null, cTInboxListViewFragmentM6745i, true, -1));
        }
    }
}
