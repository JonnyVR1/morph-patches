package com.tencent.could.huiyansdk.manager;

import android.os.Message;
import android.util.SparseArray;
import com.tencent.could.huiyansdk.C13869R;
import com.tencent.could.huiyansdk.api.C13880j;
import com.tencent.could.huiyansdk.callback.InterfaceC13882a;
import com.tencent.could.huiyansdk.callback.InterfaceC13883b;
import com.tencent.could.huiyansdk.callback.InterfaceC13885d;
import com.tencent.could.huiyansdk.callback.InterfaceC13886e;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.fragments.C13896f;
import com.tencent.could.huiyansdk.turing.C13924f;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13902b {

    /* JADX INFO: renamed from: b */
    public InterfaceC13882a f57411b;

    /* JADX INFO: renamed from: c */
    public InterfaceC13883b f57412c;

    /* JADX INFO: renamed from: e */
    public int[] f57414e;

    /* JADX INFO: renamed from: f */
    public int[] f57415f;

    /* JADX INFO: renamed from: g */
    public int[] f57416g;

    /* JADX INFO: renamed from: h */
    public int[] f57417h;

    /* JADX INFO: renamed from: l */
    public C13906f f57421l;

    /* JADX INFO: renamed from: m */
    public SparseArray<HuiYanAuthTipsEvent> f57422m;

    /* JADX INFO: renamed from: n */
    public HuiYanAuthTipsEvent f57423n;

    /* JADX INFO: renamed from: o */
    public int f57424o;

    /* JADX INFO: renamed from: p */
    public int f57425p;

    /* JADX INFO: renamed from: q */
    public int f57426q;

    /* JADX INFO: renamed from: r */
    public int f57427r;

    /* JADX INFO: renamed from: a */
    public AuthState f57410a = AuthState.PREPARE;

    /* JADX INFO: renamed from: d */
    public boolean f57413d = false;

    /* JADX INFO: renamed from: i */
    public int f57418i = -1;

    /* JADX INFO: renamed from: j */
    public int f57419j = -1;

    /* JADX INFO: renamed from: k */
    public int f57420k = 3;

    /* JADX INFO: renamed from: s */
    public volatile boolean f57428s = false;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.b$a */
    public class a implements InterfaceC13885d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f57429a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f57430b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f57431c;

        public a(boolean z, String str, String str2) {
            this.f57429a = z;
            this.f57430b = str;
            this.f57431c = str2;
        }

        /* JADX INFO: renamed from: a */
        public void m82332a() {
            C13905e.a.f57445a.m82337a(2, "AuthStateManager", "start compare.");
            C13902b.this.m82328a(AuthState.AUTH_END, (Object) null);
            C13880j c13880j = C13880j.a.f57352a;
            c13880j.m82232a(HuiYanAuthEvent.LOCAL_DETECTION_DONE, true);
            boolean z = this.f57429a;
            String str = this.f57430b;
            if (z) {
                c13880j.m82234a(str, this.f57431c);
            } else {
                c13880j.m82234a(str, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C13902b f57433a = new C13902b();
    }

    public C13902b() {
        int i = C13869R.string.fl_no_face;
        int i2 = C13869R.string.fl_incomplete_face;
        int i3 = C13869R.string.fl_pose_incorrect;
        int i4 = C13869R.string.fl_no_left_face;
        int i5 = C13869R.string.fl_no_right_face;
        int i6 = C13869R.string.fl_no_chin;
        int i7 = C13869R.string.fl_no_mouth;
        int i8 = C13869R.string.fl_no_nose;
        int i9 = C13869R.string.fl_no_left_eye;
        int i10 = C13869R.string.fl_no_right_eye;
        int i11 = C13869R.string.fl_pose_closer;
        int i12 = C13869R.string.fl_pose_farer;
        int i13 = C13869R.string.fl_too_many_faces;
        int i14 = C13869R.string.fl_pose_open_eye;
        this.f57414e = new int[]{i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, C13869R.string.fl_close_mouth, i14, C13869R.string.msg_fsm_pause};
        this.f57415f = new int[]{C13869R.string.fl_act_blink, C13869R.string.fl_act_open_mouth, C13869R.string.fl_act_shake_head, C13869R.string.fl_act_nod_head, C13869R.string.fl_pose_keep};
        this.f57416g = new int[]{C13869R.string.fl_act_screen_shaking};
        this.f57417h = new int[]{C13869R.string.rst_succeed, C13869R.string.rst_failed, C13869R.string.net_fetch_data, C13869R.string.net_fetch_failed, C13869R.string.net_reporting, C13869R.string.msg_net_error, C13869R.string.msg_param_error, C13869R.string.msg_inner_error, C13869R.string.msg_user_cancel, C13869R.string.msg_cam_error, C13869R.string.msg_light_dark, C13869R.string.msg_light_norm, C13869R.string.msg_light_bright};
        m82326a();
    }

    /* JADX INFO: renamed from: a */
    public final void m82326a() {
        if (this.f57422m == null) {
            SparseArray<HuiYanAuthTipsEvent> sparseArray = new SparseArray<>(20);
            this.f57422m = sparseArray;
            sparseArray.put(C13869R.string.fl_act_open_mouth, HuiYanAuthTipsEvent.ACT_OPEN_MOUTH);
            this.f57422m.put(C13869R.string.fl_act_blink, HuiYanAuthTipsEvent.ACT_BLINK);
            this.f57422m.put(C13869R.string.fl_act_nod_head, HuiYanAuthTipsEvent.ACT_NOD_HEAD);
            this.f57422m.put(C13869R.string.fl_act_shake_head, HuiYanAuthTipsEvent.ACT_SHAKE_HEAD);
            this.f57422m.put(C13869R.string.fl_act_screen_shaking, HuiYanAuthTipsEvent.ACT_SCREEN_SHAKING);
            this.f57422m.put(C13869R.string.fl_no_face, HuiYanAuthTipsEvent.NO_FACE);
            this.f57422m.put(C13869R.string.fl_no_left_face, HuiYanAuthTipsEvent.NO_LEFT_FACE);
            this.f57422m.put(C13869R.string.fl_no_right_face, HuiYanAuthTipsEvent.NO_RIGHT_FACE);
            this.f57422m.put(C13869R.string.fl_no_chin, HuiYanAuthTipsEvent.NO_CHIN);
            this.f57422m.put(C13869R.string.fl_no_mouth, HuiYanAuthTipsEvent.NO_MOUTH);
            this.f57422m.put(C13869R.string.fl_no_nose, HuiYanAuthTipsEvent.NO_NOSE);
            this.f57422m.put(C13869R.string.fl_no_left_eye, HuiYanAuthTipsEvent.NO_LEFT_EYE);
            this.f57422m.put(C13869R.string.fl_no_right_eye, HuiYanAuthTipsEvent.NO_RIGHT_EYE);
            this.f57422m.put(C13869R.string.fl_pose_keep, HuiYanAuthTipsEvent.POSE_KEEP);
            this.f57422m.put(C13869R.string.fl_incomplete_face, HuiYanAuthTipsEvent.INCOMPLETE_FACE);
            this.f57422m.put(C13869R.string.fl_pose_closer, HuiYanAuthTipsEvent.POSE_CLOSER);
            this.f57422m.put(C13869R.string.fl_pose_farer, HuiYanAuthTipsEvent.POSE_FARTHER);
            this.f57422m.put(C13869R.string.fl_pose_incorrect, HuiYanAuthTipsEvent.POSE_INCORRECT);
            this.f57422m.put(C13869R.string.fl_too_many_faces, HuiYanAuthTipsEvent.TOO_MANY_FACE);
            this.f57422m.put(C13869R.string.fl_pose_open_eye, HuiYanAuthTipsEvent.POSE_OPEN_EYE);
        }
        this.f57423n = HuiYanAuthTipsEvent.NONE;
    }

    /* JADX INFO: renamed from: a */
    public void m82329a(final String str) {
        C13905e.a.f57445a.m82337a(2, "AuthStateManager", "do live compare result");
        C13906f c13906f = this.f57421l;
        if (c13906f == null) {
            m82325b(str, true, "");
        } else {
            c13906f.m82358c(new InterfaceC13886e() { // from class: l.tkq0
                @Override // com.tencent.could.huiyansdk.callback.InterfaceC13886e
                /* JADX INFO: renamed from: a */
                public final void mo82245a(boolean z, String str2) {
                    this.f170908a.m82325b(str, z, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void m82325b(String str, boolean z, String str2) {
        C13924f c13924f = C13924f.a.f57496a;
        a aVar = new a(z, str, str2);
        TuringResultCacheEntity turingResultCacheEntity = c13924f.f57487f;
        if (!(turingResultCacheEntity != null ? turingResultCacheEntity.isNeedFrameCheck() : false)) {
            aVar.m82332a();
            return;
        }
        if (c13924f.f57486e) {
            aVar.m82332a();
            return;
        }
        c13924f.f57490i = aVar;
        if (c13924f.f57494m != null) {
            Message messageObtainMessage = c13924f.f57494m.obtainMessage();
            messageObtainMessage.what = 4;
            c13924f.f57494m.sendMessageDelayed(messageObtainMessage, c13924f.f57482a);
            return;
        }
        C13905e.a.f57445a.m82337a(2, "TuringSdkHelper", "waiting handler is null!");
    }

    /* JADX INFO: renamed from: a */
    public void m82328a(AuthState authState, Object obj) {
        this.f57410a = authState;
        InterfaceC13882a interfaceC13882a = this.f57411b;
        if (interfaceC13882a != null) {
            interfaceC13882a.mo82244a(authState, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m82327a(int i) {
        InterfaceC13883b interfaceC13883b = this.f57412c;
        if (interfaceC13883b != null) {
            ((C13896f) interfaceC13883b).m82305b(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82331a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
