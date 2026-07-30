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

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.g */
/* JADX INFO: loaded from: classes.dex */
class C1288g extends C1285d {

    /* JADX INFO: renamed from: r */
    private final Button f5359r;

    /* JADX INFO: renamed from: s */
    private final Button f5360s;

    /* JADX INFO: renamed from: t */
    private final Button f5361t;

    /* JADX INFO: renamed from: u */
    private final TextView f5362u;

    /* JADX INFO: renamed from: v */
    private final TextView f5363v;

    /* JADX INFO: renamed from: w */
    private final TextView f5364w;

    public C1288g(@NonNull View view) {
        super(view);
        view.setTag(this);
        this.f5364w = (TextView) view.findViewById(c4c0.f79177F0);
        this.f5362u = (TextView) view.findViewById(c4c0.f79175E0);
        this.f5363v = (TextView) view.findViewById(c4c0.f79197P0);
        this.f5359r = (Button) view.findViewById(c4c0.f79239o);
        this.f5360s = (Button) view.findViewById(c4c0.f79241p);
        this.f5361t = (Button) view.findViewById(c4c0.f79243q);
        this.f5330e = (ImageView) view.findViewById(c4c0.f79171C0);
        this.f5335j = (RelativeLayout) view.findViewById(c4c0.f79185J0);
        this.f5329d = (FrameLayout) view.findViewById(c4c0.f79183I0);
        this.f5331f = (ImageView) view.findViewById(c4c0.f79193N0);
        this.f5332g = (ImageView) view.findViewById(c4c0.f79249t);
        this.f5336k = (RelativeLayout) view.findViewById(c4c0.f79217d);
        this.f5327b = (LinearLayout) view.findViewById(c4c0.f79245r);
        this.f5328c = (LinearLayout) view.findViewById(c4c0.f79213b);
        this.f5334i = (FrameLayout) view.findViewById(c4c0.f79187K0);
        this.f5333h = (RelativeLayout) view.findViewById(c4c0.f79173D0);
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
    @Override // com.clevertap.android.sdk.inbox.C1285d
    /* JADX INFO: renamed from: f */
    public void mo6734f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        int i2;
        int iRound;
        int iM5922s;
        boolean zIsEmpty;
        ImageView imageView;
        int iM5922s2;
        super.mo6734f(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragmentM6745i = m6745i();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.m6682d().get(0);
        this.f5364w.setText(cTInboxMessageContent.m6711s());
        this.f5364w.setTextColor(Color.parseColor(cTInboxMessageContent.m6712t()));
        this.f5362u.setText(cTInboxMessageContent.m6708p());
        this.f5362u.setTextColor(Color.parseColor(cTInboxMessageContent.m6709q()));
        this.f5328c.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5363v.setText(m6743e(cTInboxMessage.m6681c()));
        this.f5363v.setTextColor(Color.parseColor(cTInboxMessageContent.m6712t()));
        boolean zM6688k = cTInboxMessage.m6688k();
        ImageView imageView2 = this.f5342q;
        if (zM6688k) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
        }
        this.f5329d.setVisibility(8);
        JSONArray jSONArrayM6704l = cTInboxMessageContent.m6704l();
        LinearLayout linearLayout = this.f5327b;
        if (jSONArrayM6704l != null) {
            linearLayout.setVisibility(0);
            int length = jSONArrayM6704l.length();
            try {
                if (length == 1) {
                    JSONObject jSONObject = jSONArrayM6704l.getJSONObject(0);
                    this.f5359r.setVisibility(0);
                    this.f5359r.setText(cTInboxMessageContent.m6702i(jSONObject));
                    this.f5359r.setTextColor(Color.parseColor(cTInboxMessageContent.m6699f(jSONObject)));
                    this.f5359r.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6698e(jSONObject)));
                    m6747k(this.f5359r, this.f5360s, this.f5361t);
                    if (cTInboxListViewFragmentM6745i != null) {
                        Button button = this.f5359r;
                        button.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button.getText().toString(), jSONObject, cTInboxListViewFragmentM6745i, false, 0));
                    }
                } else if (length == 2) {
                    JSONObject jSONObject2 = jSONArrayM6704l.getJSONObject(0);
                    this.f5359r.setVisibility(0);
                    this.f5359r.setText(cTInboxMessageContent.m6702i(jSONObject2));
                    this.f5359r.setTextColor(Color.parseColor(cTInboxMessageContent.m6699f(jSONObject2)));
                    this.f5359r.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6698e(jSONObject2)));
                    JSONObject jSONObject3 = jSONArrayM6704l.getJSONObject(1);
                    this.f5360s.setVisibility(0);
                    this.f5360s.setText(cTInboxMessageContent.m6702i(jSONObject3));
                    this.f5360s.setTextColor(Color.parseColor(cTInboxMessageContent.m6699f(jSONObject3)));
                    this.f5360s.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6698e(jSONObject3)));
                    m6746j(this.f5359r, this.f5360s, this.f5361t);
                    if (cTInboxListViewFragmentM6745i != null) {
                        Button button2 = this.f5359r;
                        button2.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button2.getText().toString(), jSONObject2, cTInboxListViewFragmentM6745i, false, 0));
                        Button button3 = this.f5360s;
                        button3.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button3.getText().toString(), jSONObject3, cTInboxListViewFragmentM6745i, false, 1));
                    }
                } else if (length == 3) {
                    JSONObject jSONObject4 = jSONArrayM6704l.getJSONObject(0);
                    this.f5359r.setVisibility(0);
                    this.f5359r.setText(cTInboxMessageContent.m6702i(jSONObject4));
                    this.f5359r.setTextColor(Color.parseColor(cTInboxMessageContent.m6699f(jSONObject4)));
                    this.f5359r.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6698e(jSONObject4)));
                    JSONObject jSONObject5 = jSONArrayM6704l.getJSONObject(1);
                    this.f5360s.setVisibility(0);
                    this.f5360s.setText(cTInboxMessageContent.m6702i(jSONObject5));
                    this.f5360s.setTextColor(Color.parseColor(cTInboxMessageContent.m6699f(jSONObject5)));
                    this.f5360s.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6698e(jSONObject5)));
                    JSONObject jSONObject6 = jSONArrayM6704l.getJSONObject(2);
                    this.f5361t.setVisibility(0);
                    this.f5361t.setText(cTInboxMessageContent.m6702i(jSONObject6));
                    this.f5361t.setTextColor(Color.parseColor(cTInboxMessageContent.m6699f(jSONObject6)));
                    this.f5361t.setBackgroundColor(Color.parseColor(cTInboxMessageContent.m6698e(jSONObject6)));
                    if (cTInboxListViewFragmentM6745i != null) {
                        Button button4 = this.f5359r;
                        button4.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button4.getText().toString(), jSONObject4, cTInboxListViewFragmentM6745i, false, 0));
                        Button button5 = this.f5360s;
                        button5.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button5.getText().toString(), jSONObject5, cTInboxListViewFragmentM6745i, false, 1));
                        Button button6 = this.f5361t;
                        button6.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, button6.getText().toString(), jSONObject6, cTInboxListViewFragmentM6745i, false, 2));
                    }
                }
            } catch (JSONException e) {
                Logger.m5865d("Error parsing CTA JSON - " + e.getLocalizedMessage());
            }
        } else {
            linearLayout.setVisibility(8);
        }
        this.f5330e.setVisibility(8);
        this.f5330e.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5331f.setVisibility(8);
        this.f5331f.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5332g.setVisibility(8);
        this.f5332g.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5332g.setContentDescription(null);
        this.f5333h.setVisibility(8);
        this.f5334i.setVisibility(8);
        try {
            String strM6684f = cTInboxMessage.m6684f();
            int iHashCode = strM6684f.hashCode();
            if (iHashCode != 108) {
                if (iHashCode == 112 && strM6684f.equals("p")) {
                    if (!TextUtils.isEmpty(cTInboxMessageContent.m6707o())) {
                        this.f5331f.setContentDescription(cTInboxMessageContent.m6707o());
                    }
                    if (cTInboxMessageContent.m6717z()) {
                        this.f5333h.setVisibility(0);
                        this.f5331f.setVisibility(0);
                        this.f5331f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143276t(cTInboxMessageContent.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5331f);
                        } catch (NoSuchMethodError unused) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143276t(cTInboxMessageContent.m6706n()).m199993w0(this.f5331f);
                        }
                    } else if (cTInboxMessageContent.m6716y()) {
                        this.f5333h.setVisibility(0);
                        this.f5331f.setVisibility(0);
                        this.f5331f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143269m().m199985B0(cTInboxMessageContent.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5331f);
                        } catch (NoSuchMethodError unused2) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143269m().m199985B0(cTInboxMessageContent.m6706n()).m199993w0(this.f5331f);
                        }
                    } else if (cTInboxMessageContent.m6693B()) {
                        boolean zIsEmpty2 = cTInboxMessageContent.m6710r().isEmpty();
                        RelativeLayout relativeLayout = this.f5333h;
                        if (zIsEmpty2) {
                            relativeLayout.setVisibility(0);
                            this.f5331f.setVisibility(0);
                            int i3 = CTInboxActivity.f5256k;
                            ImageView imageView3 = this.f5331f;
                            if (i3 == 2) {
                                imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            int iM5922s3 = Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL);
                            if (iM5922s3 != -1) {
                                ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143275s(Integer.valueOf(iM5922s3)).m199993w0(this.f5331f);
                            }
                        } else {
                            relativeLayout.setVisibility(0);
                            this.f5331f.setVisibility(0);
                            int i4 = CTInboxActivity.f5256k;
                            ImageView imageView4 = this.f5331f;
                            if (i4 == 2) {
                                imageView4.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                            }
                            try {
                                ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143276t(cTInboxMessageContent.m6710r()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL)).m199430j(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL))).m199993w0(this.f5331f);
                            } catch (NoSuchMethodError unused3) {
                                Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143276t(cTInboxMessageContent.m6710r()).m199993w0(this.f5331f);
                            }
                        }
                    } else if (cTInboxMessageContent.m6715x()) {
                        this.f5333h.setVisibility(0);
                        this.f5331f.setVisibility(0);
                        this.f5331f.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.f5331f.setBackgroundColor(m6744g());
                        int iM5922s4 = Utils.m5922s(this.f5326a, Constants.AUDIO_THUMBNAIL);
                        if (iM5922s4 != -1) {
                            ComponentCallbacks2C1053a.m5316u(this.f5331f.getContext()).m143275s(Integer.valueOf(iM5922s4)).m199993w0(this.f5331f);
                        }
                    }
                } else if (!TextUtils.isEmpty(cTInboxMessageContent.m6706n())) {
                    if (!TextUtils.isEmpty(cTInboxMessageContent.m6707o())) {
                        this.f5332g.setContentDescription(cTInboxMessageContent.m6707o());
                    }
                    if (cTInboxMessageContent.m6717z()) {
                        this.f5333h.setVisibility(0);
                        this.f5332g.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5332g);
                        } catch (NoSuchMethodError unused4) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent.m6706n()).m199993w0(this.f5332g);
                        }
                    } else if (cTInboxMessageContent.m6716y()) {
                        this.f5333h.setVisibility(0);
                        this.f5332g.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143269m().m199985B0(cTInboxMessageContent.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5332g);
                        } catch (NoSuchMethodError unused5) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143269m().m199985B0(cTInboxMessageContent.m6706n()).m199993w0(this.f5332g);
                        }
                    } else if (cTInboxMessageContent.m6693B()) {
                        this.f5333h.setVisibility(0);
                        zIsEmpty = cTInboxMessageContent.m6710r().isEmpty();
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
                                ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent.m6710r()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL)).m199430j(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL))).m199993w0(this.f5332g);
                            } catch (NoSuchMethodError unused6) {
                                Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                                ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent.m6710r()).m199993w0(this.f5332g);
                            }
                        }
                    } else if (cTInboxMessageContent.m6715x()) {
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
                if (!TextUtils.isEmpty(cTInboxMessageContent.m6707o())) {
                    this.f5330e.setContentDescription(cTInboxMessageContent.m6707o());
                }
                if (cTInboxMessageContent.m6717z()) {
                    this.f5333h.setVisibility(0);
                    this.f5330e.setVisibility(0);
                    this.f5330e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    try {
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143276t(cTInboxMessageContent.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5330e);
                    } catch (NoSuchMethodError unused7) {
                        Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143276t(cTInboxMessageContent.m6706n()).m199993w0(this.f5330e);
                    }
                } else if (cTInboxMessageContent.m6716y()) {
                    this.f5333h.setVisibility(0);
                    this.f5330e.setVisibility(0);
                    this.f5330e.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    try {
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143269m().m199985B0(cTInboxMessageContent.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5330e);
                    } catch (NoSuchMethodError unused8) {
                        Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143269m().m199985B0(cTInboxMessageContent.m6706n()).m199993w0(this.f5330e);
                    }
                } else if (cTInboxMessageContent.m6693B()) {
                    boolean zIsEmpty3 = cTInboxMessageContent.m6710r().isEmpty();
                    RelativeLayout relativeLayout2 = this.f5333h;
                    if (zIsEmpty3) {
                        relativeLayout2.setVisibility(0);
                        this.f5330e.setVisibility(0);
                        this.f5330e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        int iM5922s5 = Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL);
                        if (iM5922s5 != -1) {
                            ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143275s(Integer.valueOf(iM5922s5)).m199993w0(this.f5330e);
                        }
                    } else {
                        relativeLayout2.setVisibility(0);
                        this.f5330e.setVisibility(0);
                        this.f5330e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        try {
                            ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143276t(cTInboxMessageContent.m6710r()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL)).m199430j(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL))).m199993w0(this.f5330e);
                        } catch (NoSuchMethodError unused9) {
                            Logger.m5865d("CleverTap SDK requires Glide v4.9.0 or above. Please refer CleverTap Documentation for more info");
                            ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143276t(cTInboxMessageContent.m6710r()).m199993w0(this.f5330e);
                        }
                    }
                } else if (cTInboxMessageContent.m6715x()) {
                    this.f5333h.setVisibility(0);
                    this.f5330e.setVisibility(0);
                    this.f5330e.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.f5330e.setBackgroundColor(m6744g());
                    int iM5922s6 = Utils.m5922s(this.f5326a, Constants.AUDIO_THUMBNAIL);
                    if (iM5922s6 != -1) {
                        ComponentCallbacks2C1053a.m5316u(this.f5330e.getContext()).m143275s(Integer.valueOf(iM5922s6)).m199993w0(this.f5330e);
                    }
                }
            } else if (!TextUtils.isEmpty(cTInboxMessageContent.m6706n())) {
                if (!TextUtils.isEmpty(cTInboxMessageContent.m6707o())) {
                    this.f5332g.setContentDescription(cTInboxMessageContent.m6707o());
                }
                if (cTInboxMessageContent.m6717z()) {
                    this.f5333h.setVisibility(0);
                    this.f5332g.setVisibility(0);
                    this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5332g);
                } else if (cTInboxMessageContent.m6716y()) {
                    this.f5333h.setVisibility(0);
                    this.f5332g.setVisibility(0);
                    this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143269m().m199985B0(cTInboxMessageContent.m6706n()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER)).m199430j(Utils.m5922s(this.f5326a, Constants.IMAGE_PLACEHOLDER))).m199993w0(this.f5332g);
                } else if (cTInboxMessageContent.m6693B()) {
                    this.f5333h.setVisibility(0);
                    zIsEmpty = cTInboxMessageContent.m6710r().isEmpty();
                    imageView = this.f5332g;
                    if (zIsEmpty) {
                        imageView.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143276t(cTInboxMessageContent.m6710r()).mo199417a(new muc0().m199415X(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL)).m199430j(Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL))).m199993w0(this.f5332g);
                    } else {
                        imageView.setVisibility(0);
                        this.f5332g.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        iM5922s2 = Utils.m5922s(this.f5326a, Constants.VIDEO_THUMBNAIL);
                        if (iM5922s2 != -1) {
                            ComponentCallbacks2C1053a.m5316u(this.f5332g.getContext()).m143275s(Integer.valueOf(iM5922s2)).m199993w0(this.f5332g);
                        }
                    }
                } else if (cTInboxMessageContent.m6715x()) {
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
            Logger.m5865d("CleverTap SDK requires Glide dependency. Please refer CleverTap Documentation for more info");
        }
        Resources resources = this.f5326a.getResources();
        if (CTInboxActivity.f5256k == 2) {
            iRound = resources.getDisplayMetrics().heightPixels / 2;
            i2 = resources.getDisplayMetrics().widthPixels / 2;
        } else {
            i2 = resources.getDisplayMetrics().widthPixels;
            iRound = (!cTInboxMessage.m6684f().equalsIgnoreCase(BLiveStormDanmakuGiftResourceType.f44444l) && cTInboxMessage.m6684f().equalsIgnoreCase("p")) ? i2 : Math.round(i2 * 0.5625f);
        }
        this.f5334i.setLayoutParams(new RelativeLayout.LayoutParams(i2, iRound));
        m6748l(cTInboxMessage, i);
        if (cTInboxListViewFragmentM6745i != null) {
            this.f5336k.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, (String) null, (JSONObject) null, cTInboxListViewFragmentM6745i, true, -1));
        }
    }
}
