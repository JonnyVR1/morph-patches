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

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.g */
/* JADX INFO: loaded from: classes.dex */
class C1311g extends C1308d {

    /* JADX INFO: renamed from: r */
    private final Button f5396r;

    /* JADX INFO: renamed from: s */
    private final Button f5397s;

    /* JADX INFO: renamed from: t */
    private final Button f5398t;

    /* JADX INFO: renamed from: u */
    private final TextView f5399u;

    /* JADX INFO: renamed from: v */
    private final TextView f5400v;

    /* JADX INFO: renamed from: w */
    private final TextView f5401w;

    public C1311g(@NonNull View view) {
        super(view);
        view.setTag(this);
        this.f5401w = (TextView) view.findViewById(icc0.f114313F0);
        this.f5399u = (TextView) view.findViewById(icc0.f114311E0);
        this.f5400v = (TextView) view.findViewById(icc0.f114333P0);
        this.f5396r = (Button) view.findViewById(icc0.f114375o);
        this.f5397s = (Button) view.findViewById(icc0.f114377p);
        this.f5398t = (Button) view.findViewById(icc0.f114379q);
        this.f5367e = (ImageView) view.findViewById(icc0.f114307C0);
        this.f5372j = (RelativeLayout) view.findViewById(icc0.f114321J0);
        this.f5366d = (FrameLayout) view.findViewById(icc0.f114319I0);
        this.f5368f = (ImageView) view.findViewById(icc0.f114329N0);
        this.f5369g = (ImageView) view.findViewById(icc0.f114385t);
        this.f5373k = (RelativeLayout) view.findViewById(icc0.f114353d);
        this.f5364b = (LinearLayout) view.findViewById(icc0.f114381r);
        this.f5365c = (LinearLayout) view.findViewById(icc0.f114349b);
        this.f5371i = (FrameLayout) view.findViewById(icc0.f114323K0);
        this.f5370h = (RelativeLayout) view.findViewById(icc0.f114309D0);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x06a5 A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x06af A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x06b9 A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x06c8 A[Catch: NoClassDefFoundError -> 0x087e, TRY_LEAVE, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x072d A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0733 A[Catch: NoClassDefFoundError -> 0x087e, TRY_LEAVE, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x07a0 A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x07a6 A[Catch: NoClassDefFoundError -> 0x087e, TRY_LEAVE, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x07b7 A[Catch: NoClassDefFoundError -> 0x087e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0814 A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0826 A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x083e A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0844 A[Catch: NoClassDefFoundError -> 0x087e, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0866 A[Catch: NoClassDefFoundError -> 0x087e, TRY_LEAVE, TryCatch #3 {NoClassDefFoundError -> 0x087e, blocks: (B:29:0x02ba, B:35:0x02d5, B:37:0x02db, B:39:0x02e5, B:40:0x02ee, B:42:0x02f4, B:43:0x0305, B:45:0x033d, B:46:0x0359, B:48:0x035f, B:49:0x0370, B:51:0x03ac, B:52:0x03cc, B:54:0x03d2, B:57:0x03de, B:60:0x03ed, B:62:0x03f8, B:64:0x0430, B:61:0x03f3, B:65:0x044c, B:68:0x045b, B:70:0x0466, B:72:0x046e, B:69:0x0461, B:73:0x0487, B:75:0x048d, B:77:0x04af, B:112:0x06a5, B:114:0x06af, B:116:0x06b9, B:117:0x06c2, B:119:0x06c8, B:120:0x06d9, B:122:0x0711, B:123:0x072d, B:125:0x0733, B:126:0x0744, B:128:0x0780, B:129:0x07a0, B:131:0x07a6, B:134:0x07b7, B:135:0x07c1, B:137:0x07f9, B:138:0x0814, B:140:0x0826, B:141:0x083e, B:143:0x0844, B:145:0x0866, B:78:0x04c8, B:80:0x04ce, B:82:0x04d8, B:83:0x04e1, B:85:0x04e7, B:86:0x04f8, B:88:0x0530, B:89:0x054c, B:91:0x0552, B:92:0x0563, B:94:0x059f, B:95:0x05bf, B:97:0x05c5, B:100:0x05d1, B:101:0x05e0, B:103:0x0618, B:104:0x0634, B:106:0x064b, B:107:0x0664, B:109:0x066a, B:111:0x068c), top: B:169:0x02ba, inners: #0, #2, #4, #5, #6, #7, #8, #9, #10 }] */
    @Override // com.clevertap.android.sdk.inbox.C1308d
    /* JADX INFO: renamed from: f */
    public void mo6788f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        int i2;
        int iRound;
        int iM5976s;
        boolean zIsEmpty;
        ImageView imageView;
        int iM5976s2;
        super.mo6788f(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragmentM6799i = m6799i();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.m6736d().get(0);
        this.f5401w.setText(cTInboxMessageContent.m6765s());
        this.f5401w.setTextColor(Color.parseColor(cTInboxMessageContent.m6766t()));
        this.f5399u.setText(cTInboxMessageContent.m6762p());
        this.f5399u.setTextColor(Color.parseColor(cTInboxMessageContent.m6763q()));
        this.f5365c.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5400v.setText(m6797e(cTInboxMessage.m6735c()));
        this.f5400v.setTextColor(Color.parseColor(cTInboxMessageContent.m6766t()));
        boolean zM6742k = cTInboxMessage.m6742k();
        ImageView imageView2 = this.f5379q;
        if (zM6742k) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
        }
        this.f5366d.setVisibility(8);
        JSONArray jSONArrayM6758l = cTInboxMessageContent.m6758l();
        LinearLayout linearLayout = this.f5364b;
        if (jSONArrayM6758l != null) {
            linearLayout.setVisibility(0);
            int length = jSONArrayM6758l.length();
            try {
                if (length == 1) {
                    JSONObject jSONObject = jSONArrayM6758l.getJSONObject(0);
                    this.f5396r.setVisibility(0);
                    this.f5396r.setText(cTInboxMessageContent.m6756i(jSONObject));
                    this.f5396r.setTextColor(Color.parseColor(cTInboxMessageContent.m6753f(jSONObject)));
                    this.f5396r.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6752e(jSONObject)));
                    m6801k(this.f5396r, this.f5397s, this.f5398t);
                    if (cTInboxListViewFragmentM6799i != null) {
                        Button button = this.f5396r;
                        button.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button.getText().toString(), jSONObject, cTInboxListViewFragmentM6799i, false, 0));
                    }
                } else if (length == 2) {
                    JSONObject jSONObject2 = jSONArrayM6758l.getJSONObject(0);
                    this.f5396r.setVisibility(0);
                    this.f5396r.setText(cTInboxMessageContent.m6756i(jSONObject2));
                    this.f5396r.setTextColor(Color.parseColor(cTInboxMessageContent.m6753f(jSONObject2)));
                    this.f5396r.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6752e(jSONObject2)));
                    JSONObject jSONObject3 = jSONArrayM6758l.getJSONObject(1);
                    this.f5397s.setVisibility(0);
                    this.f5397s.setText(cTInboxMessageContent.m6756i(jSONObject3));
                    this.f5397s.setTextColor(Color.parseColor(cTInboxMessageContent.m6753f(jSONObject3)));
                    this.f5397s.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6752e(jSONObject3)));
                    m6800j(this.f5396r, this.f5397s, this.f5398t);
                    if (cTInboxListViewFragmentM6799i != null) {
                        Button button2 = this.f5396r;
                        button2.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button2.getText().toString(), jSONObject2, cTInboxListViewFragmentM6799i, false, 0));
                        Button button3 = this.f5397s;
                        button3.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button3.getText().toString(), jSONObject3, cTInboxListViewFragmentM6799i, false, 1));
                    }
                } else if (length == 3) {
                    JSONObject jSONObject4 = jSONArrayM6758l.getJSONObject(0);
                    this.f5396r.setVisibility(0);
                    this.f5396r.setText(cTInboxMessageContent.m6756i(jSONObject4));
                    this.f5396r.setTextColor(Color.parseColor(cTInboxMessageContent.m6753f(jSONObject4)));
                    this.f5396r.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6752e(jSONObject4)));
                    JSONObject jSONObject5 = jSONArrayM6758l.getJSONObject(1);
                    this.f5397s.setVisibility(0);
                    this.f5397s.setText(cTInboxMessageContent.m6756i(jSONObject5));
                    this.f5397s.setTextColor(Color.parseColor(cTInboxMessageContent.m6753f(jSONObject5)));
                    this.f5397s.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6752e(jSONObject5)));
                    JSONObject jSONObject6 = jSONArrayM6758l.getJSONObject(2);
                    this.f5398t.setVisibility(0);
                    this.f5398t.setText(cTInboxMessageContent.m6756i(jSONObject6));
                    this.f5398t.setTextColor(Color.parseColor(cTInboxMessageContent.m6753f(jSONObject6)));
                    this.f5398t.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6752e(jSONObject6)));
                    if (cTInboxListViewFragmentM6799i != null) {
                        Button button4 = this.f5396r;
                        button4.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button4.getText().toString(), jSONObject4, cTInboxListViewFragmentM6799i, false, 0));
                        Button button5 = this.f5397s;
                        button5.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button5.getText().toString(), jSONObject5, cTInboxListViewFragmentM6799i, false, 1));
                        Button button6 = this.f5398t;
                        button6.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, button6.getText().toString(), jSONObject6, cTInboxListViewFragmentM6799i, false, 2));
                    }
                }
            } catch (JSONException e) {
                Logger.m5919d("Error parsing CTA JSON - " + e.getLocalizedMessage());
            }
        } else {
            linearLayout.setVisibility(8);
        }
        this.f5367e.setVisibility(8);
        this.f5367e.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5368f.setVisibility(8);
        this.f5368f.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5369g.setVisibility(8);
        this.f5369g.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5369g.setContentDescription(null);
        this.f5370h.setVisibility(8);
        this.f5371i.setVisibility(8);
        try {
            String strM6738f = cTInboxMessage.m6738f();
            int iHashCode = strM6738f.hashCode();
            if (iHashCode != 108) {
                if (iHashCode == 112 && strM6738f.equals("p")) {
                    if (!TextUtils.isEmpty(cTInboxMessageContent.m6761o())) {
                        this.f5368f.setContentDescription(cTInboxMessageContent.m6761o());
                    }
                    if (cTInboxMessageContent.m6771z()) {
                        this.f5370h.setVisibility(0);
                        this.f5368f.setVisibility(0);
                        this.f5368f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156821t(cTInboxMessageContent.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5368f);
                        } catch (NoSuchMethodError unused) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156821t(cTInboxMessageContent.m6760n()).m95652x0(this.f5368f);
                        }
                    } else if (cTInboxMessageContent.m6770y()) {
                        this.f5370h.setVisibility(0);
                        this.f5368f.setVisibility(0);
                        this.f5368f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156814m().m95642D0(cTInboxMessageContent.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5368f);
                        } catch (NoSuchMethodError unused2) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156814m().m95642D0(cTInboxMessageContent.m6760n()).m95652x0(this.f5368f);
                        }
                    } else if (cTInboxMessageContent.m6747B()) {
                        boolean zIsEmpty2 = cTInboxMessageContent.m6764r().isEmpty();
                        RelativeLayout relativeLayout = this.f5370h;
                        if (zIsEmpty2) {
                            relativeLayout.setVisibility(0);
                            this.f5368f.setVisibility(0);
                            int i3 = CTInboxActivity.f5293k;
                            ImageView imageView3 = this.f5368f;
                            if (i3 == 2) {
                                imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            int iM5976s3 = Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL);
                            if (iM5976s3 != -1) {
                                ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156820s(Integer.valueOf(iM5976s3)).m95652x0(this.f5368f);
                            }
                        } else {
                            relativeLayout.setVisibility(0);
                            this.f5368f.setVisibility(0);
                            int i4 = CTInboxActivity.f5293k;
                            ImageView imageView4 = this.f5368f;
                            if (i4 == 2) {
                                imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            try {
                                ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156821t(cTInboxMessageContent.m6764r()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL)).m155557j(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL))).m95652x0(this.f5368f);
                            } catch (NoSuchMethodError unused3) {
                                Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156821t(cTInboxMessageContent.m6764r()).m95652x0(this.f5368f);
                            }
                        }
                    } else if (cTInboxMessageContent.m6769x()) {
                        this.f5370h.setVisibility(0);
                        this.f5368f.setVisibility(0);
                        this.f5368f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f5368f.setBackgroundColor(m6798g());
                        int iM5976s4 = Utils.m5976s(this.f5363a, Constants.AUDIO_THUMBNAIL);
                        if (iM5976s4 != -1) {
                            ComponentCallbacks2C1057a.m5325t(this.f5368f.getContext()).m156820s(Integer.valueOf(iM5976s4)).m95652x0(this.f5368f);
                        }
                    }
                } else if (!TextUtils.isEmpty(cTInboxMessageContent.m6760n())) {
                    if (!TextUtils.isEmpty(cTInboxMessageContent.m6761o())) {
                        this.f5369g.setContentDescription(cTInboxMessageContent.m6761o());
                    }
                    if (cTInboxMessageContent.m6771z()) {
                        this.f5370h.setVisibility(0);
                        this.f5369g.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5369g);
                        } catch (NoSuchMethodError unused4) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent.m6760n()).m95652x0(this.f5369g);
                        }
                    } else if (cTInboxMessageContent.m6770y()) {
                        this.f5370h.setVisibility(0);
                        this.f5369g.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156814m().m95642D0(cTInboxMessageContent.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5369g);
                        } catch (NoSuchMethodError unused5) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156814m().m95642D0(cTInboxMessageContent.m6760n()).m95652x0(this.f5369g);
                        }
                    } else if (cTInboxMessageContent.m6747B()) {
                        this.f5370h.setVisibility(0);
                        zIsEmpty = cTInboxMessageContent.m6764r().isEmpty();
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
                                ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent.m6764r()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL)).m155557j(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL))).m95652x0(this.f5369g);
                            } catch (NoSuchMethodError unused6) {
                                Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent.m6764r()).m95652x0(this.f5369g);
                            }
                        }
                    } else if (cTInboxMessageContent.m6769x()) {
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
                if (!TextUtils.isEmpty(cTInboxMessageContent.m6761o())) {
                    this.f5367e.setContentDescription(cTInboxMessageContent.m6761o());
                }
                if (cTInboxMessageContent.m6771z()) {
                    this.f5370h.setVisibility(0);
                    this.f5367e.setVisibility(0);
                    this.f5367e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    try {
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156821t(cTInboxMessageContent.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5367e);
                    } catch (NoSuchMethodError unused7) {
                        Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156821t(cTInboxMessageContent.m6760n()).m95652x0(this.f5367e);
                    }
                } else if (cTInboxMessageContent.m6770y()) {
                    this.f5370h.setVisibility(0);
                    this.f5367e.setVisibility(0);
                    this.f5367e.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    try {
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156814m().m95642D0(cTInboxMessageContent.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5367e);
                    } catch (NoSuchMethodError unused8) {
                        Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156814m().m95642D0(cTInboxMessageContent.m6760n()).m95652x0(this.f5367e);
                    }
                } else if (cTInboxMessageContent.m6747B()) {
                    boolean zIsEmpty3 = cTInboxMessageContent.m6764r().isEmpty();
                    RelativeLayout relativeLayout2 = this.f5370h;
                    if (zIsEmpty3) {
                        relativeLayout2.setVisibility(0);
                        this.f5367e.setVisibility(0);
                        this.f5367e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int iM5976s5 = Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL);
                        if (iM5976s5 != -1) {
                            ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156820s(Integer.valueOf(iM5976s5)).m95652x0(this.f5367e);
                        }
                    } else {
                        relativeLayout2.setVisibility(0);
                        this.f5367e.setVisibility(0);
                        this.f5367e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156821t(cTInboxMessageContent.m6764r()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL)).m155557j(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL))).m95652x0(this.f5367e);
                        } catch (NoSuchMethodError unused9) {
                            Logger.m5919d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156821t(cTInboxMessageContent.m6764r()).m95652x0(this.f5367e);
                        }
                    }
                } else if (cTInboxMessageContent.m6769x()) {
                    this.f5370h.setVisibility(0);
                    this.f5367e.setVisibility(0);
                    this.f5367e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.f5367e.setBackgroundColor(m6798g());
                    int iM5976s6 = Utils.m5976s(this.f5363a, Constants.AUDIO_THUMBNAIL);
                    if (iM5976s6 != -1) {
                        ComponentCallbacks2C1057a.m5325t(this.f5367e.getContext()).m156820s(Integer.valueOf(iM5976s6)).m95652x0(this.f5367e);
                    }
                }
            } else if (!TextUtils.isEmpty(cTInboxMessageContent.m6760n())) {
                if (!TextUtils.isEmpty(cTInboxMessageContent.m6761o())) {
                    this.f5369g.setContentDescription(cTInboxMessageContent.m6761o());
                }
                if (cTInboxMessageContent.m6771z()) {
                    this.f5370h.setVisibility(0);
                    this.f5369g.setVisibility(0);
                    this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5369g);
                } else if (cTInboxMessageContent.m6770y()) {
                    this.f5370h.setVisibility(0);
                    this.f5369g.setVisibility(0);
                    this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156814m().m95642D0(cTInboxMessageContent.m6760n()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER)).m155557j(Utils.m5976s(this.f5363a, Constants.IMAGE_PLACEHOLDER))).m95652x0(this.f5369g);
                } else if (cTInboxMessageContent.m6747B()) {
                    this.f5370h.setVisibility(0);
                    zIsEmpty = cTInboxMessageContent.m6764r().isEmpty();
                    imageView = this.f5369g;
                    if (zIsEmpty) {
                        imageView.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156821t(cTInboxMessageContent.m6764r()).mo95645a(new p2d0().m155544Y(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL)).m155557j(Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL))).m95652x0(this.f5369g);
                    } else {
                        imageView.setVisibility(0);
                        this.f5369g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        iM5976s2 = Utils.m5976s(this.f5363a, Constants.VIDEO_THUMBNAIL);
                        if (iM5976s2 != -1) {
                            ComponentCallbacks2C1057a.m5325t(this.f5369g.getContext()).m156820s(Integer.valueOf(iM5976s2)).m95652x0(this.f5369g);
                        }
                    }
                } else if (cTInboxMessageContent.m6769x()) {
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
            Logger.m5919d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        Resources resources = this.f5363a.getResources();
        if (CTInboxActivity.f5293k == 2) {
            iRound = resources.getDisplayMetrics().heightPixels / 2;
            i2 = resources.getDisplayMetrics().widthPixels / 2;
        } else {
            i2 = resources.getDisplayMetrics().widthPixels;
            iRound = (!cTInboxMessage.m6738f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f45292l) && cTInboxMessage.m6738f().equalsIgnoreCase("p")) ? i2 : Math.round(i2 * 0.5625f);
        }
        this.f5371i.setLayoutParams(new RelativeLayout.LayoutParams(i2, iRound));
        m6802l(cTInboxMessage, i);
        if (cTInboxListViewFragmentM6799i != null) {
            this.f5373k.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, (String) null, (JSONObject) null, cTInboxListViewFragmentM6799i, true, -1));
        }
    }
}
