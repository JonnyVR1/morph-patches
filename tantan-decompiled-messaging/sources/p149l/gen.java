package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMlnMedia;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class gen {
    public static final int REQUEST_JSCODE_PICKER = 789;

    @Nullable
    private final PutongAct act;
    private e30<String> callback;
    private zpd0 lastUploadLogTimeSp = new zpd0("lastUploadLogTime_" + l9s.m149072e().userId(), 0L);

    public gen(@Nullable PutongAct putongAct) {
        this.act = putongAct;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ BLiveIntlMlnMedia m125832e(List list) {
        return (BLiveIntlMlnMedia) list.get(0);
    }

    /* JADX INFO: renamed from: h */
    public void m125835h(d30 d30Var) {
        if (this.act != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m125836i() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastUploadLogTimeSp.get().longValue() <= s9s.f163228b.m195617E5()) {
            return false;
        }
        this.lastUploadLogTimeSp.put(Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m125837j() {
        this.act.progressDismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m125838k(List list) {
        m125835h(new d30() { // from class: l.den
            @Override // p149l.d30
            public final void call() {
                this.f85819a.m125837j();
            }
        });
        return Boolean.valueOf(!vwb.m200296J(list));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m125839l() {
        this.act.progressDismiss();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m125840m(BLiveIntlMlnMedia bLiveIntlMlnMedia) {
        m125835h(new d30() { // from class: l.een
            @Override // p149l.d30
            public final void call() {
                this.f90754a.m125839l();
            }
        });
        e30<String> e30Var = this.callback;
        if (e30Var != null) {
            e30Var.call(bLiveIntlMlnMedia.url);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m125841n() {
        this.act.progressDismiss();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m125842o(Throwable th) {
        m125835h(new d30() { // from class: l.fen
            @Override // p149l.d30
            public final void call() {
                this.f97143a.m125841n();
            }
        });
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            lsi0.m151593w(R$string.f44889a);
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m125843p(int i, int i2, Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (i2 == -1) {
            arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
        }
        m125844q(arrayList, i2);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m125844q(List<Media> list, int i) {
        if (i != -1 || list.size() <= 0) {
            return;
        }
        Media media = list.get(0);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            picture.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            pgm pgmVar = new pgm(rhi.m179382z(picture.url));
            picture.mediaType = pgmVar.f148729c;
            picture.size = new Dimension(pgmVar.f148730d);
            m125847t(picture);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m125845r(e30<String> e30Var) {
        this.callback = e30Var;
    }

    /* JADX INFO: renamed from: s */
    public void m125846s() {
        if (m125836i()) {
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(5, -1);
            Date time = calendar.getTime();
            ArrayList arrayList = new ArrayList();
            arrayList.add(date);
            arrayList.add(time);
            i500.m134436d().m134440e(arrayList, "intl_feedback");
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m125847t(Picture picture) {
        if (!m125848u(picture)) {
            lsi0.m151593w(R$string.f44874L);
            return;
        }
        PutongAct putongAct = this.act;
        if (putongAct != null) {
            putongAct.progress(R$string.f44893c);
            this.act.duringCreated((C22306c) h500.m129348B(picture, UploadSource.get("report"), ytr.m216073b("/live/upload/image?source=intlfeedback")).filter(new w9j() { // from class: l.zdn
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f202685a.m125838k((List) obj);
                }
            }).map(new w9j() { // from class: l.aen
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return gen.m125832e((List) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.ben
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75174a.m125840m((BLiveIntlMlnMedia) obj);
                }
            }, new e30() { // from class: l.cen
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80479a.m125842o((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m125848u(Picture picture) {
        if (picture == null || TextUtils.isEmpty(picture.url)) {
            return true;
        }
        String strM179382z = rhi.m179382z(picture.url);
        return TextUtils.isEmpty(strM179382z) || new File(strM179382z).length() / 1024 <= s9s.f163228b.m195609D5();
    }
}
