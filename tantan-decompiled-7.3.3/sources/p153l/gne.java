package p153l;

import android.annotation.SuppressLint;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class gne extends ep90 {

    /* JADX INFO: renamed from: u */
    public tr90 f105077u;

    /* JADX INFO: renamed from: v */
    public MediaReorderCards f105078v;

    /* JADX INFO: renamed from: w */
    public View f105079w;

    /* JADX INFO: renamed from: x */
    public View f105080x;

    /* JADX INFO: renamed from: y */
    public final t4m f105081y;

    /* JADX INFO: renamed from: l.gne$a */
    public class C17257a implements t4m {
        public C17257a() {
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: a */
        public void mo52398a() {
            if (xra.m212804w()) {
                gne.this.mo53983O().mo52250J3();
            }
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: b */
        public void mo48722b() {
            gne.this.m130852S();
            if (xra.m212804w()) {
                gne.this.mo53983O().mo52250J3();
            }
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: c */
        public void mo48723c() {
            gne.this.m130852S();
        }

        @Override // p153l.t4m
        /* JADX INFO: renamed from: d */
        public void mo48724d() {
            gne.this.m130852S();
        }
    }

    public gne(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f105081y = new C17257a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m130852S() {
        for (int i = 0; i < this.f105078v.getChildCount(); i++) {
            boolean zM212795n = xra.m212795n();
            MediaReorderCards mediaReorderCards = this.f105078v;
            if (zM212795n) {
                mediaReorderCards.m51994h(i).m51853R1(i);
            } else {
                mediaReorderCards.m51994h(i).m51834I0(i);
            }
        }
    }

    @Override // p153l.on2
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        view.setElevation(10.0f);
        mo53983O().mo52272Y0().setClipChildren(false);
        view.setOutlineProvider(null);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        if (this.f105077u == null) {
            this.f105077u = new tr90(mo53983O().act(), null);
        }
        View view = this.f105080x;
        if (view != null) {
            return view;
        }
        Pair<View, MediaReorderCards> pairM192438u = this.f105077u.m192438u(viewGroup, false);
        this.f105079w = this.f105077u.m192437p();
        this.f105078v = (MediaReorderCards) pairM192438u.second;
        if (xra.m212804w()) {
            this.f105078v.setViewCount(9);
            bnl0.m105524M(this.f105079w, false);
        }
        this.f105078v.setSlideWithoutPress(false);
        this.f105078v.setEnableLowPhotoValid(false);
        this.f105078v.setCurPageId("p_edit_profile_view");
        int childCount = this.f105078v.getChildCount();
        int i = 0;
        while (i < childCount) {
            MediaReorderCard mediaReorderCardM51994h = this.f105078v.m51994h(i);
            if (xra.m212804w()) {
                mediaReorderCardM51994h.f33905n = i > 0;
                mediaReorderCardM51994h.f33907p = i == 0;
                VImage vImage = mediaReorderCardM51994h.f33842u;
                if (i == 0) {
                    vImage.setImageResource(kbc0.f124909s1);
                } else {
                    vImage.setImageResource(kbc0.f124903q1);
                }
                mediaReorderCardM51994h.m51835I1(true, true);
            } else {
                mediaReorderCardM51994h.setMainPicTag(this.f105079w);
            }
            if (xra.m212795n()) {
                mediaReorderCardM51994h.setCardDataType(MediaReorderCard.CardDataType.EDIT);
            }
            i++;
        }
        Object obj = pairM192438u.first;
        this.f105080x = (View) obj;
        return (View) obj;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
    }
}
