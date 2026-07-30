package p149l;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p046p1.mobile.putong.data.User;
import p147v.VImage;
import p147v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class bgo extends C0605k.e {

    /* JADX INFO: renamed from: d */
    public final InterfaceC15856a f75472d;

    /* JADX INFO: renamed from: e */
    public boolean f75473e = false;

    /* JADX INFO: renamed from: f */
    public boolean f75474f = false;

    /* JADX INFO: renamed from: g */
    public boolean f75475g = false;

    /* JADX INFO: renamed from: l.bgo$a */
    public interface InterfaceC15856a {
        /* JADX INFO: renamed from: a */
        void mo101674a(View view, User user, boolean z, boolean z2, boolean z3);

        /* JADX INFO: renamed from: n */
        boolean mo101675n();

        /* JADX INFO: renamed from: o */
        void mo101676o(boolean z);
    }

    public bgo(InterfaceC15856a interfaceC15856a) {
        this.f75472d = interfaceC15856a;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: B */
    public void mo3773B(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        View view;
        if (abstractC0566d0 == null || (view = abstractC0566d0.itemView) == null) {
            return;
        }
        if (view instanceof IntlMeetLikersItemView) {
            if (!this.f75473e) {
                this.f75472d.mo101676o(this.f75474f);
                return;
            } else {
                IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) view;
                this.f75472d.mo101674a(intlMeetLikersItemView, intlMeetLikersItemView.f24250q, this.f75474f, false, false);
                return;
            }
        }
        if (view instanceof IntlMeetFakeLikersItem) {
            this.f75472d.mo101674a(view, ((IntlMeetFakeLikersItem) view).getUser(), this.f75474f, false, false);
        } else if (view instanceof IntlMeetFakeTurboItem) {
            this.f75472d.mo101674a(view, null, this.f75474f, false, false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m101672C(View view) {
        return (view instanceof IntlMeetLikersItemView) || (view instanceof IntlMeetFakeLikersItem) || (view instanceof IntlMeetFakeTurboItem);
    }

    /* JADX INFO: renamed from: D */
    public float m101673D(int i, float f) {
        float fMo33289B9 = i / CoreModule.m29935P().m94651a().mo33289B9();
        if (fMo33289B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo33289B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: k */
    public int mo3783k(@NonNull RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        if (!m101672C(abstractC0566d0.itemView)) {
            return C0605k.e.m3771t(0, 0);
        }
        RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return C0605k.e.m3771t(15, 15);
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return C0605k.e.m3771t(0, 0);
        }
        int i = 3;
        int i2 = 12;
        if (((LinearLayoutManager) layoutManager).getOrientation() == 0) {
            i2 = 3;
            i = 12;
        }
        return C0605k.e.m3771t(i, i2);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: l */
    public float mo3784l(float f) {
        return 2.1474836E9f;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: m */
    public float mo3785m(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return 0.25f;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: r */
    public boolean mo3790r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: u */
    public void mo3791u(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, float f, float f2, int i, boolean z) {
        if (i == 1 && (abstractC0566d0.itemView instanceof IntlMeetLikersItemView)) {
            float width = recyclerView.getWidth() * mo3785m(abstractC0566d0);
            float fM101673D = m101673D(abstractC0566d0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM101673D = -fM101673D;
            }
            IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) abstractC0566d0.itemView;
            VImage vImage = intlMeetLikersItemView.f24239f;
            VImage vImage2 = intlMeetLikersItemView.f24238e;
            boolean zMo101675n = this.f75472d.mo101675n();
            if (fM101673D > 0.0f) {
                if (!zMo101675n) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(4);
                    vImage.setAlpha(fM101673D);
                }
                if (z) {
                    this.f75474f = true;
                    this.f75475g = false;
                }
            } else if (fM101673D < 0.0f) {
                if (!zMo101675n) {
                    vImage.setVisibility(4);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM101673D);
                }
                if (z) {
                    this.f75474f = false;
                    this.f75475g = true;
                }
            } else {
                if (!zMo101675n) {
                    vImage.setVisibility(4);
                    vImage2.setVisibility(4);
                }
                if (z) {
                    this.f75474f = false;
                    this.f75475g = false;
                }
            }
            if (z) {
                this.f75473e = Math.abs(f) > width;
            }
        } else if (i == 1 && z) {
            View view = abstractC0566d0.itemView;
            if ((view instanceof IntlMeetFakeLikersItem) || (view instanceof IntlMeetFakeTurboItem)) {
                float fM101673D2 = m101673D(view.getMeasuredWidth(), Math.abs(f) * 2.0f);
                if (f <= 0.0f) {
                    fM101673D2 = -fM101673D2;
                }
                this.f75474f = fM101673D2 > 0.0f;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m223189F(abstractC0566d0.itemView);
        }
        super.mo3791u(canvas, recyclerView, abstractC0566d0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0605k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3795y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d1) {
        return false;
    }
}
