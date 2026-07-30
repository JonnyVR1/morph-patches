package p002l;

import android.annotation.SuppressLint;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCards;
import l.e3c0;
import l.lqa;
import l.mcr;
import l.pj90;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cme extends ah90 {

    /* JADX INFO: renamed from: u */
    public pj90 f8745u;

    /* JADX INFO: renamed from: v */
    public MediaReorderCards f8746v;

    /* JADX INFO: renamed from: w */
    public View f8747w;

    /* JADX INFO: renamed from: x */
    public View f8748x;

    /* JADX INFO: renamed from: y */
    public final a2m f8749y;

    /* JADX INFO: renamed from: l.cme$a */
    public class C0516a implements a2m {
        public C0516a() {
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: a */
        public void mo1667a() {
            if (lqa.w()) {
                cme.this.mo3351O().mo1515J3();
            }
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: b */
        public void mo1668b() {
            cme.this.m11109S();
            if (lqa.w()) {
                cme.this.mo3351O().mo1515J3();
            }
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: c */
        public void mo1669c() {
            cme.this.m11109S();
        }

        @Override // p002l.a2m
        /* JADX INFO: renamed from: d */
        public void mo1670d() {
            cme.this.m11109S();
        }
    }

    public cme(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f8749y = new C0516a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m11109S() {
        for (int i = 0; i < this.f8746v.getChildCount(); i++) {
            boolean zN = lqa.n();
            MediaReorderCards mediaReorderCards = this.f8746v;
            if (zN) {
                mediaReorderCards.m1257h(i).m1106R1(i);
            } else {
                mediaReorderCards.m1257h(i).m1087I0(i);
            }
        }
    }

    @Override // p002l.hn2
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        view.setElevation(10.0f);
        mo3351O().mo1537Y0().setClipChildren(false);
        view.setOutlineProvider(null);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        if (this.f8745u == null) {
            this.f8745u = new pj90(mo3351O().act(), (VText) null);
        }
        View view = this.f8748x;
        if (view != null) {
            return view;
        }
        Pair pairU = this.f8745u.u(viewGroup, false);
        this.f8747w = this.f8745u.p();
        this.f8746v = (MediaReorderCards) pairU.second;
        if (lqa.w()) {
            this.f8746v.setViewCount(9);
            xdl0.M(this.f8747w, false);
        }
        this.f8746v.setSlideWithoutPress(false);
        this.f8746v.setEnableLowPhotoValid(false);
        this.f8746v.setCurPageId("p_edit_profile_view");
        int childCount = this.f8746v.getChildCount();
        int i = 0;
        while (i < childCount) {
            MediaReorderCard mediaReorderCardM1257h = this.f8746v.m1257h(i);
            if (lqa.w()) {
                mediaReorderCardM1257h.f879n = i > 0;
                mediaReorderCardM1257h.f881p = i == 0;
                VImage vImage = mediaReorderCardM1257h.f816u;
                if (i == 0) {
                    vImage.setImageResource(e3c0.s1);
                } else {
                    vImage.setImageResource(e3c0.q1);
                }
                mediaReorderCardM1257h.m1088I1(true, true);
            } else {
                mediaReorderCardM1257h.setMainPicTag(this.f8747w);
            }
            if (lqa.n()) {
                mediaReorderCardM1257h.setCardDataType(MediaReorderCard.CardDataType.EDIT);
            }
            i++;
        }
        Object obj = pairU.first;
        this.f8748x = (View) obj;
        return (View) obj;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }
}
