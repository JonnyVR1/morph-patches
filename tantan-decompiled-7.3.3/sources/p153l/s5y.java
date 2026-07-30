package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.EditProfileAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.ArrayList;
import kotlin.Triple;
import p137rx.subjects.C22508b;
import p151v.VListCell;

/* JADX INFO: loaded from: classes4.dex */
public class s5y {

    /* JADX INFO: renamed from: a */
    public w30 f166521a = null;

    /* JADX INFO: renamed from: b */
    public Act f166522b;

    /* JADX INFO: renamed from: c */
    public ad00 f166523c;

    public s5y(xc00 xc00Var) {
        this.f166522b = xc00Var.mo99543c();
        this.f166523c = (ad00) xc00Var.mo99544d();
    }

    /* JADX INFO: renamed from: e */
    public void m184824e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f166522b.getString(R$string.f19169d));
        arrayList.add(this.f166522b.getString(R$string.f19199e));
        w30.C21001b c21001b = new w30.C21001b(this.f166522b);
        c21001b.m204657I(this.f166522b.getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.o5y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145125a.m184825f(view);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.p5y
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f150707a.m184828i(vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f166521a = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m184825f(View view) {
        this.f166521a.m204614b();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m184826g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f166523c.m97005c("tantan_swipe_uploadImage", new C19993a(), str);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m184827h(Triple triple) {
        if (triple != null) {
            this.f166523c.m97005c("tantan_swipe_uploadVideo", new C19994b(), (String) triple.getFirst(), "", (String) triple.getSecond(), (String) triple.getThird());
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m184828i(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        this.f166521a.m204614b();
        if (TextUtils.equals(c22660a.f210081a, this.f166522b.string(R$string.f19169d))) {
            C22508b<String> c22508bM222767b = C22508b.m222767b();
            MediaPickerAct.f54849e = c22508bM222767b;
            this.f166522b.duringCreated(c22508bM222767b).subscribe(psd0.m173596G(new y20() { // from class: l.q5y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155771a.m184826g((String) obj);
                }
            }));
            Act act = this.f166522b;
            act.startActivityForResult(MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(bnl0.m105592y0() - qa00.m175859d(40.0f)).build()).withFromType(9).setCroppingNewStyle(this.f166522b instanceof EditProfileAct).build()), PutongAct.REQUEST_CODE_PICKER_WITH_SWIPE);
            this.f166522b.overridePendingTransition(x7c0.f192710y, 0);
            return;
        }
        if (TextUtils.equals(c22660a.f210081a, this.f166522b.string(R$string.f19199e))) {
            C22508b<Triple<String, String, String>> c22508bM222767b2 = C22508b.m222767b();
            MediaPickerAct.f54850f = c22508bM222767b2;
            this.f166522b.duringCreated(c22508bM222767b2).subscribe(psd0.m173596G(new y20() { // from class: l.r5y
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161415a.m184827h((Triple) obj);
                }
            }));
            Act act2 = this.f166522b;
            act2.startActivityForResult(MediaPickerAct.m80102Y1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(9).build()), PutongAct.REQUEST_CODE_PICKER_WITH_SWIPE);
            this.f166522b.overridePendingTransition(x7c0.f192710y, 0);
        }
    }

    /* JADX INFO: renamed from: l.s5y$a */
    public class C19993a implements y20<String> {
        public C19993a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
        }
    }

    /* JADX INFO: renamed from: l.s5y$b */
    public class C19994b implements y20<String> {
        public C19994b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
        }
    }
}
