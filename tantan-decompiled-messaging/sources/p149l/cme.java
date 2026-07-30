package p149l;

import android.annotation.SuppressLint;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class cme extends ah90 {

    /* JADX INFO: renamed from: u */
    public pj90 f81525u;

    /* JADX INFO: renamed from: v */
    public MediaReorderCards f81526v;

    /* JADX INFO: renamed from: w */
    public View f81527w;

    /* JADX INFO: renamed from: x */
    public View f81528x;

    /* JADX INFO: renamed from: y */
    public final a2m f81529y;

    /* JADX INFO: renamed from: l.cme$a */
    public class C16193a implements a2m {
        public C16193a() {
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: a */
        public void mo51215a() {
            if (lqa.m150985w()) {
                cme.this.mo52800O().mo51067J3();
            }
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: b */
        public void mo47539b() {
            cme.this.m107613S();
            if (lqa.m150985w()) {
                cme.this.mo52800O().mo51067J3();
            }
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: c */
        public void mo47540c() {
            cme.this.m107613S();
        }

        @Override // p149l.a2m
        /* JADX INFO: renamed from: d */
        public void mo47541d() {
            cme.this.m107613S();
        }
    }

    public cme(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f81529y = new C16193a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m107613S() {
        for (int i = 0; i < this.f81526v.getChildCount(); i++) {
            boolean zM150976n = lqa.m150976n();
            MediaReorderCards mediaReorderCards = this.f81526v;
            if (zM150976n) {
                mediaReorderCards.m50811h(i).m50670R1(i);
            } else {
                mediaReorderCards.m50811h(i).m50651I0(i);
            }
        }
    }

    @Override // p149l.hn2
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        view.setElevation(10.0f);
        mo52800O().mo51089Y0().setClipChildren(false);
        view.setOutlineProvider(null);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        if (this.f81525u == null) {
            this.f81525u = new pj90(mo52800O().act(), null);
        }
        View view = this.f81528x;
        if (view != null) {
            return view;
        }
        Pair<View, MediaReorderCards> pairM169813u = this.f81525u.m169813u(viewGroup, false);
        this.f81527w = this.f81525u.m169812p();
        this.f81526v = (MediaReorderCards) pairM169813u.second;
        if (lqa.m150985w()) {
            this.f81526v.setViewCount(9);
            xdl0.m208344M(this.f81527w, false);
        }
        this.f81526v.setSlideWithoutPress(false);
        this.f81526v.setEnableLowPhotoValid(false);
        this.f81526v.setCurPageId("p_edit_profile_view");
        int childCount = this.f81526v.getChildCount();
        int i = 0;
        while (i < childCount) {
            MediaReorderCard mediaReorderCardM50811h = this.f81526v.m50811h(i);
            if (lqa.m150985w()) {
                mediaReorderCardM50811h.f33057n = i > 0;
                mediaReorderCardM50811h.f33059p = i == 0;
                VImage vImage = mediaReorderCardM50811h.f32994u;
                if (i == 0) {
                    vImage.setImageResource(e3c0.f89146s1);
                } else {
                    vImage.setImageResource(e3c0.f89140q1);
                }
                mediaReorderCardM50811h.m50652I1(true, true);
            } else {
                mediaReorderCardM50811h.setMainPicTag(this.f81527w);
            }
            if (lqa.m150976n()) {
                mediaReorderCardM50811h.setCardDataType(MediaReorderCard.CardDataType.EDIT);
            }
            i++;
        }
        Object obj = pairM169813u.first;
        this.f81528x = (View) obj;
        return (View) obj;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
    }
}
