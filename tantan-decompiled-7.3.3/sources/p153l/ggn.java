package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMlnMedia;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class ggn {
    public static final int REQUEST_JSCODE_PICKER = 789;

    @Nullable
    private final PutongAct act;
    private y20<String> callback;
    private byd0 lastUploadLogTimeSp = new byd0("lastUploadLogTime_" + mbs.m157849e().userId(), 0L);

    public ggn(@Nullable PutongAct putongAct) {
        this.act = putongAct;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BLiveIntlMlnMedia m130172e(List list) {
        return (BLiveIntlMlnMedia) list.get(0);
    }

    /* JADX INFO: renamed from: h */
    public void m130175h(x20 x20Var) {
        if (this.act != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m130176i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastUploadLogTimeSp.get().longValue() <= tbs.f172989b.m203404E5()) {
            return false;
        }
        this.lastUploadLogTimeSp.put(Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m130177j() {
        this.act.progressDismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m130178k(List list) {
        m130175h(new x20() { // from class: l.dgn
            @Override // p153l.x20
            public final void call() {
                this.f88319a.m130177j();
            }
        });
        return Boolean.valueOf(!jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m130179l() {
        this.act.progressDismiss();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m130180m(BLiveIntlMlnMedia bLiveIntlMlnMedia) {
        m130175h(new x20() { // from class: l.egn
            @Override // p153l.x20
            public final void call() {
                this.f93953a.m130179l();
            }
        });
        y20<String> y20Var = this.callback;
        if (y20Var != null) {
            y20Var.call(bLiveIntlMlnMedia.url);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m130181n() {
        this.act.progressDismiss();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m130182o(Throwable th) {
        m130175h(new x20() { // from class: l.fgn
            @Override // p153l.x20
            public final void call() {
                this.f98956a.m130181n();
            }
        });
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            o1j0.m165649w(R$string.f45737a);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m130183p(int i, int i2, Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (i2 == -1) {
            arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
        }
        m130184q(arrayList, i2);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m130184q(List<Media> list, int i) {
        if (i != -1 || list.size() <= 0) {
            return;
        }
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            sim simVar = new sim(oki.m168038z(picture.url));
            picture.mediaType = simVar.f168842c;
            picture.size = new Dimension(simVar.f168843d);
            m130187t(picture);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m130185r(y20<String> y20Var) {
        this.callback = y20Var;
    }

    /* JADX INFO: renamed from: s */
    public void m130186s() {
        if (m130176i()) {
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(5, -1);
            Date time = calendar.getTime();
            ArrayList arrayList = new ArrayList();
            arrayList.add(date);
            arrayList.add(time);
            xd00.m210440d().m210441e(arrayList, "intl_feedback");
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m130187t(Picture picture) {
        if (!m130188u(picture)) {
            o1j0.m165649w(R$string.f45722L);
            return;
        }
        PutongAct putongAct = this.act;
        if (putongAct != null) {
            putongAct.progress(R$string.f45741c);
            this.act.duringCreated((C22421c) wd00.m205833B(picture, UploadSource.get("report"), zvr.m221802b("/live/upload/image?source=intlfeedback")).filter(new qcj() { // from class: l.zfn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f204174a.m130178k((List) obj);
                }
            }).map(new qcj() { // from class: l.agn
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ggn.m130172e((List) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.bgn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76667a.m130180m((BLiveIntlMlnMedia) obj);
                }
            }, new y20() { // from class: l.cgn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f81688a.m130182o((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m130188u(Picture picture) {
        if (picture == null || TextUtils.isEmpty(picture.url)) {
            return true;
        }
        String strM168038z = oki.m168038z(picture.url);
        return TextUtils.isEmpty(strM168038z) || new File(strM168038z).length() / 1024 <= tbs.f172989b.m203396D5();
    }
}
