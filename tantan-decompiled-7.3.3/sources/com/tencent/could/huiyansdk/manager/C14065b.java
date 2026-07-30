package com.tencent.could.huiyansdk.manager;

import android.os.Message;
import android.util.SparseArray;
import com.tencent.could.huiyansdk.C14032R;
import com.tencent.could.huiyansdk.api.C14043j;
import com.tencent.could.huiyansdk.callback.InterfaceC14045a;
import com.tencent.could.huiyansdk.callback.InterfaceC14046b;
import com.tencent.could.huiyansdk.callback.InterfaceC14048d;
import com.tencent.could.huiyansdk.callback.InterfaceC14049e;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.enums.HuiYanAuthEvent;
import com.tencent.could.huiyansdk.enums.HuiYanAuthTipsEvent;
import com.tencent.could.huiyansdk.fragments.C14059f;
import com.tencent.could.huiyansdk.turing.C14087f;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.b */
/* JADX INFO: loaded from: classes12.dex */
public class C14065b {

    /* JADX INFO: renamed from: b */
    public InterfaceC14045a f58259b;

    /* JADX INFO: renamed from: c */
    public InterfaceC14046b f58260c;

    /* JADX INFO: renamed from: e */
    public int[] f58262e;

    /* JADX INFO: renamed from: f */
    public int[] f58263f;

    /* JADX INFO: renamed from: g */
    public int[] f58264g;

    /* JADX INFO: renamed from: h */
    public int[] f58265h;

    /* JADX INFO: renamed from: l */
    public C14069f f58269l;

    /* JADX INFO: renamed from: m */
    public SparseArray<HuiYanAuthTipsEvent> f58270m;

    /* JADX INFO: renamed from: n */
    public HuiYanAuthTipsEvent f58271n;

    /* JADX INFO: renamed from: o */
    public int f58272o;

    /* JADX INFO: renamed from: p */
    public int f58273p;

    /* JADX INFO: renamed from: q */
    public int f58274q;

    /* JADX INFO: renamed from: r */
    public int f58275r;

    /* JADX INFO: renamed from: a */
    public AuthState f58258a = AuthState.PREPARE;

    /* JADX INFO: renamed from: d */
    public boolean f58261d = false;

    /* JADX INFO: renamed from: i */
    public int f58266i = -1;

    /* JADX INFO: renamed from: j */
    public int f58267j = -1;

    /* JADX INFO: renamed from: k */
    public int f58268k = 3;

    /* JADX INFO: renamed from: s */
    public volatile boolean f58276s = false;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.b$a */
    public class a implements InterfaceC14048d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f58277a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f58278b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f58279c;

        public a(boolean z, String str, String str2) {
            this.f58277a = z;
            this.f58278b = str;
            this.f58279c = str2;
        }

        /* JADX INFO: renamed from: a */
        public void m83515a() {
            C14068e.a.f58293a.m83520a(2, "AuthStateManager", "start compare.");
            C14065b.this.m83511a(AuthState.AUTH_END, (Object) null);
            C14043j c14043j = C14043j.a.f58200a;
            c14043j.m83415a(HuiYanAuthEvent.LOCAL_DETECTION_DONE, true);
            boolean z = this.f58277a;
            String str = this.f58278b;
            if (z) {
                c14043j.m83417a(str, this.f58279c);
            } else {
                c14043j.m83417a(str, "");
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C14065b f58281a = new C14065b();
    }

    public C14065b() {
        int i = C14032R.string.fl_no_face;
        int i2 = C14032R.string.fl_incomplete_face;
        int i3 = C14032R.string.fl_pose_incorrect;
        int i4 = C14032R.string.fl_no_left_face;
        int i5 = C14032R.string.fl_no_right_face;
        int i6 = C14032R.string.fl_no_chin;
        int i7 = C14032R.string.fl_no_mouth;
        int i8 = C14032R.string.fl_no_nose;
        int i9 = C14032R.string.fl_no_left_eye;
        int i10 = C14032R.string.fl_no_right_eye;
        int i11 = C14032R.string.fl_pose_closer;
        int i12 = C14032R.string.fl_pose_farer;
        int i13 = C14032R.string.fl_too_many_faces;
        int i14 = C14032R.string.fl_pose_open_eye;
        this.f58262e = new int[]{i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, C14032R.string.fl_close_mouth, i14, C14032R.string.msg_fsm_pause};
        this.f58263f = new int[]{C14032R.string.fl_act_blink, C14032R.string.fl_act_open_mouth, C14032R.string.fl_act_shake_head, C14032R.string.fl_act_nod_head, C14032R.string.fl_pose_keep};
        this.f58264g = new int[]{C14032R.string.fl_act_screen_shaking};
        this.f58265h = new int[]{C14032R.string.rst_succeed, C14032R.string.rst_failed, C14032R.string.net_fetch_data, C14032R.string.net_fetch_failed, C14032R.string.net_reporting, C14032R.string.msg_net_error, C14032R.string.msg_param_error, C14032R.string.msg_inner_error, C14032R.string.msg_user_cancel, C14032R.string.msg_cam_error, C14032R.string.msg_light_dark, C14032R.string.msg_light_norm, C14032R.string.msg_light_bright};
        m83509a();
    }

    /* JADX INFO: renamed from: a */
    public final void m83509a() {
        if (this.f58270m == null) {
            SparseArray<HuiYanAuthTipsEvent> sparseArray = new SparseArray<>(20);
            this.f58270m = sparseArray;
            sparseArray.put(C14032R.string.fl_act_open_mouth, HuiYanAuthTipsEvent.ACT_OPEN_MOUTH);
            this.f58270m.put(C14032R.string.fl_act_blink, HuiYanAuthTipsEvent.ACT_BLINK);
            this.f58270m.put(C14032R.string.fl_act_nod_head, HuiYanAuthTipsEvent.ACT_NOD_HEAD);
            this.f58270m.put(C14032R.string.fl_act_shake_head, HuiYanAuthTipsEvent.ACT_SHAKE_HEAD);
            this.f58270m.put(C14032R.string.fl_act_screen_shaking, HuiYanAuthTipsEvent.ACT_SCREEN_SHAKING);
            this.f58270m.put(C14032R.string.fl_no_face, HuiYanAuthTipsEvent.NO_FACE);
            this.f58270m.put(C14032R.string.fl_no_left_face, HuiYanAuthTipsEvent.NO_LEFT_FACE);
            this.f58270m.put(C14032R.string.fl_no_right_face, HuiYanAuthTipsEvent.NO_RIGHT_FACE);
            this.f58270m.put(C14032R.string.fl_no_chin, HuiYanAuthTipsEvent.NO_CHIN);
            this.f58270m.put(C14032R.string.fl_no_mouth, HuiYanAuthTipsEvent.NO_MOUTH);
            this.f58270m.put(C14032R.string.fl_no_nose, HuiYanAuthTipsEvent.NO_NOSE);
            this.f58270m.put(C14032R.string.fl_no_left_eye, HuiYanAuthTipsEvent.NO_LEFT_EYE);
            this.f58270m.put(C14032R.string.fl_no_right_eye, HuiYanAuthTipsEvent.NO_RIGHT_EYE);
            this.f58270m.put(C14032R.string.fl_pose_keep, HuiYanAuthTipsEvent.POSE_KEEP);
            this.f58270m.put(C14032R.string.fl_incomplete_face, HuiYanAuthTipsEvent.INCOMPLETE_FACE);
            this.f58270m.put(C14032R.string.fl_pose_closer, HuiYanAuthTipsEvent.POSE_CLOSER);
            this.f58270m.put(C14032R.string.fl_pose_farer, HuiYanAuthTipsEvent.POSE_FARTHER);
            this.f58270m.put(C14032R.string.fl_pose_incorrect, HuiYanAuthTipsEvent.POSE_INCORRECT);
            this.f58270m.put(C14032R.string.fl_too_many_faces, HuiYanAuthTipsEvent.TOO_MANY_FACE);
            this.f58270m.put(C14032R.string.fl_pose_open_eye, HuiYanAuthTipsEvent.POSE_OPEN_EYE);
        }
        this.f58271n = HuiYanAuthTipsEvent.NONE;
    }

    /* JADX INFO: renamed from: a */
    public void m83512a(final String str) {
        C14068e.a.f58293a.m83520a(2, "AuthStateManager", "do live compare result");
        C14069f c14069f = this.f58269l;
        if (c14069f == null) {
            m83508b(str, true, "");
        } else {
            c14069f.m83541c(new InterfaceC14049e() { // from class: l.ztq0
                @Override // com.tencent.could.huiyansdk.callback.InterfaceC14049e
                /* JADX INFO: renamed from: a */
                public final void mo83428a(boolean z, String str2) {
                    this.f206035a.m83508b(str, z, str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void m83508b(String str, boolean z, String str2) {
        C14087f c14087f = C14087f.a.f58344a;
        a aVar = new a(z, str, str2);
        TuringResultCacheEntity turingResultCacheEntity = c14087f.f58335f;
        if (!(turingResultCacheEntity != null ? turingResultCacheEntity.isNeedFrameCheck() : false)) {
            aVar.m83515a();
            return;
        }
        if (c14087f.f58334e) {
            aVar.m83515a();
            return;
        }
        c14087f.f58338i = aVar;
        if (c14087f.f58342m != null) {
            Message messageObtainMessage = c14087f.f58342m.obtainMessage();
            messageObtainMessage.what = 4;
            c14087f.f58342m.sendMessageDelayed(messageObtainMessage, c14087f.f58330a);
            return;
        }
        C14068e.a.f58293a.m83520a(2, "TuringSdkHelper", "waiting handler is null!");
    }

    /* JADX INFO: renamed from: a */
    public void m83511a(AuthState authState, Object obj) {
        this.f58258a = authState;
        InterfaceC14045a interfaceC14045a = this.f58259b;
        if (interfaceC14045a != null) {
            interfaceC14045a.mo83427a(authState, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m83510a(int i) {
        InterfaceC14046b interfaceC14046b = this.f58260c;
        if (interfaceC14046b != null) {
            ((C14059f) interfaceC14046b).m83488b(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83514a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }
}
