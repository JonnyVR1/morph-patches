package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.EditProfileAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.util.ArrayList;
import kotlin.Triple;
import p133rx.subjects.C22393b;
import p147v.VListCell;

/* JADX INFO: loaded from: classes4.dex */
public class vwx {

    /* JADX INFO: renamed from: a */
    public c40 f183399a = null;

    /* JADX INFO: renamed from: b */
    public Act f183400b;

    /* JADX INFO: renamed from: c */
    public i400 f183401c;

    public vwx(f400 f400Var) {
        this.f183400b = f400Var.mo102961c();
        this.f183401c = (i400) f400Var.mo102962d();
    }

    /* JADX INFO: renamed from: e */
    public void m200464e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f183400b.getString(R$string.f18439d));
        arrayList.add(this.f183400b.getString(R$string.f18469e));
        c40.C16057b c16057b = new c40.C16057b(this.f183400b);
        c16057b.m105156I(this.f183400b.getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.rwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161383a.m200465f(view);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.swx
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f166760a.m200468i(vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f183399a = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m200465f(View view) {
        this.f183399a.m105113b();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m200466g(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f183401c.m134311c("tantan_swipe_uploadImage", new C20752a(), str);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m200467h(Triple triple) {
        if (triple != null) {
            this.f183401c.m134311c("tantan_swipe_uploadVideo", new C20753b(), (String) triple.getFirst(), "", (String) triple.getSecond(), (String) triple.getThird());
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m200468i(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        this.f183399a.m105113b();
        if (TextUtils.equals(c22545a.f209159a, this.f183400b.string(R$string.f18439d))) {
            C22393b<String> c22393bM221521b = C22393b.m221521b();
            MediaPickerAct.f54001e = c22393bM221521b;
            this.f183400b.duringCreated(c22393bM221521b).subscribe(mkd0.m154955G(new e30() { // from class: l.twx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f172435a.m200466g((String) obj);
                }
            }));
            Act act = this.f183400b;
            act.startActivityForResult(MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.m208412y0() - t100.m186890d(40.0f)).build()).withFromType(9).setCroppingNewStyle(this.f183400b instanceof EditProfileAct).build()), PutongAct.REQUEST_CODE_PICKER_WITH_SWIPE);
            this.f183400b.overridePendingTransition(rzb0.f161653y, 0);
            return;
        }
        if (TextUtils.equals(c22545a.f209159a, this.f183400b.string(R$string.f18469e))) {
            C22393b<Triple<String, String, String>> c22393bM221521b2 = C22393b.m221521b();
            MediaPickerAct.f54002f = c22393bM221521b2;
            this.f183400b.duringCreated(c22393bM221521b2).subscribe(mkd0.m154955G(new e30() { // from class: l.uwx
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178686a.m200467h((Triple) obj);
                }
            }));
            Act act2 = this.f183400b;
            act2.startActivityForResult(MediaPickerAct.m78919X1(act2, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(9).build()), PutongAct.REQUEST_CODE_PICKER_WITH_SWIPE);
            this.f183400b.overridePendingTransition(rzb0.f161653y, 0);
        }
    }

    /* JADX INFO: renamed from: l.vwx$a */
    public class C20752a implements e30<String> {
        public C20752a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
        }
    }

    /* JADX INFO: renamed from: l.vwx$b */
    public class C20753b implements e30<String> {
        public C20753b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
        }
    }
}
