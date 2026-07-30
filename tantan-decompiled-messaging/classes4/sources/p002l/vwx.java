package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.EditProfileAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.ArrayList;
import kotlin.Triple;
import l.c40;
import l.e30;
import l.f400;
import l.i400;
import l.mkd0;
import l.rzb0;
import l.t100;
import l.xdl0;
import rx.subjects.b;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vwx {

    /* JADX INFO: renamed from: a */
    public c40 f21362a = null;

    /* JADX INFO: renamed from: b */
    public Act f21363b;

    /* JADX INFO: renamed from: c */
    public i400 f21364c;

    public vwx(f400 f400Var) {
        this.f21363b = f400Var.c();
        this.f21364c = f400Var.d();
    }

    /* JADX INFO: renamed from: e */
    public void m24185e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f21363b.getString(R.string.d));
        arrayList.add(this.f21363b.getString(R.string.e));
        c40.b bVar = new c40.b(this.f21363b);
        bVar.I(this.f21363b.getString(R.string.c)).U(new View.OnClickListener() { // from class: l.rwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18712a.m24186f(view);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.swx
            /* JADX INFO: renamed from: a */
            public final void m22742a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f19316a.m24189i(vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f21362a = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m24186f(View view) {
        this.f21362a.b();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m24187g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21364c.c("tantan_swipe_uploadImage", new C0867a(), new String[]{str});
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m24188h(Triple triple) {
        if (triple != null) {
            this.f21364c.c("tantan_swipe_uploadVideo", new C0868b(), new String[]{(String) triple.getFirst(), "", (String) triple.getSecond(), (String) triple.getThird()});
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m24189i(VListCell vListCell, VListCell.a aVar, int i) {
        this.f21362a.b();
        if (TextUtils.equals(aVar.a, this.f21363b.string(R.string.d))) {
            b bVarB = b.b();
            MediaPickerAct.e = bVarB;
            this.f21363b.duringCreated(bVarB).subscribe(mkd0.G(new e30() { // from class: l.twx
                public final void call(Object obj) {
                    this.f20413a.m24187g((String) obj);
                }
            }));
            Act act = this.f21363b;
            act.startActivityForResult(MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(9).setCroppingNewStyle(this.f21363b instanceof EditProfileAct).build()), 6666);
            this.f21363b.overridePendingTransition(rzb0.y, 0);
            return;
        }
        if (TextUtils.equals(aVar.a, this.f21363b.string(R.string.e))) {
            b bVarB2 = b.b();
            MediaPickerAct.f = bVarB2;
            this.f21363b.duringCreated(bVarB2).subscribe(mkd0.G(new e30() { // from class: l.uwx
                public final void call(Object obj) {
                    this.f20861a.m24188h((Triple) obj);
                }
            }));
            Act act2 = this.f21363b;
            act2.startActivityForResult(MediaPickerAct.X1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(9).build()), 6666);
            this.f21363b.overridePendingTransition(rzb0.y, 0);
        }
    }

    /* JADX INFO: renamed from: l.vwx$a */
    public class C0867a implements e30<String> {
        public C0867a() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
        }
    }

    /* JADX INFO: renamed from: l.vwx$b */
    public class C0868b implements e30<String> {
        public C0868b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
        }
    }
}
