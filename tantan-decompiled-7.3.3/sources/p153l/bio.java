package p153l;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p051p1.mobile.putong.data.User;
import p151v.VImage;
import p151v.VPullUpRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class bio extends C0607k.e {

    /* JADX INFO: renamed from: d */
    public final InterfaceC16017a f76900d;

    /* JADX INFO: renamed from: e */
    public boolean f76901e = false;

    /* JADX INFO: renamed from: f */
    public boolean f76902f = false;

    /* JADX INFO: renamed from: g */
    public boolean f76903g = false;

    /* JADX INFO: renamed from: l.bio$a */
    public interface InterfaceC16017a {
        /* JADX INFO: renamed from: a */
        void mo104493a(View view, User user, boolean z, boolean z2, boolean z3);

        /* JADX INFO: renamed from: n */
        boolean mo104494n();

        /* JADX INFO: renamed from: o */
        void mo104495o(boolean z);
    }

    public bio(InterfaceC16017a interfaceC16017a) {
        this.f76900d = interfaceC16017a;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: B */
    public void mo3774B(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        View view;
        if (abstractC0569e0 == null || (view = abstractC0569e0.itemView) == null) {
            return;
        }
        if (view instanceof IntlMeetLikersItemView) {
            if (!this.f76901e) {
                this.f76900d.mo104495o(this.f76902f);
                return;
            } else {
                IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) view;
                this.f76900d.mo104493a(intlMeetLikersItemView, intlMeetLikersItemView.f24992q, this.f76902f, false, false);
                return;
            }
        }
        if (view instanceof IntlMeetFakeLikersItem) {
            this.f76900d.mo104493a(view, ((IntlMeetFakeLikersItem) view).getUser(), this.f76902f, false, false);
        } else if (view instanceof IntlMeetFakeTurboItem) {
            this.f76900d.mo104493a(view, null, this.f76902f, false, false);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m104491C(View view) {
        return (view instanceof IntlMeetLikersItemView) || (view instanceof IntlMeetFakeLikersItem) || (view instanceof IntlMeetFakeTurboItem);
    }

    /* JADX INFO: renamed from: D */
    public float m104492D(int i, float f) {
        float fMo34292B9 = i / CoreModule.m30933P().m143405a().mo34292B9();
        if (fMo34292B9 == 0.0f) {
            return 0.0f;
        }
        return Math.max(-1.0f, Math.min(f / fMo34292B9, 1.0f));
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: k */
    public int mo3784k(@NonNull RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        if (!m104491C(abstractC0569e0.itemView)) {
            return C0607k.e.m3772t(0, 0);
        }
        RecyclerView.AbstractC0579o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return C0607k.e.m3772t(15, 15);
        }
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return C0607k.e.m3772t(0, 0);
        }
        int i = 3;
        int i2 = 12;
        if (((LinearLayoutManager) layoutManager).getOrientation() == 0) {
            i2 = 3;
            i = 12;
        }
        return C0607k.e.m3772t(i, i2);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: l */
    public float mo3785l(float f) {
        return 2.1474836E9f;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: m */
    public float mo3786m(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return 0.25f;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: r */
    public boolean mo3791r() {
        return false;
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: u */
    public void mo3792u(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, float f, float f2, int i, boolean z) {
        if (i == 1 && (abstractC0569e0.itemView instanceof IntlMeetLikersItemView)) {
            float width = recyclerView.getWidth() * mo3786m(abstractC0569e0);
            float fM104492D = m104492D(abstractC0569e0.itemView.getMeasuredWidth(), Math.abs(f) * 2.0f);
            if (f <= 0.0f) {
                fM104492D = -fM104492D;
            }
            IntlMeetLikersItemView intlMeetLikersItemView = (IntlMeetLikersItemView) abstractC0569e0.itemView;
            VImage vImage = intlMeetLikersItemView.f24981f;
            VImage vImage2 = intlMeetLikersItemView.f24980e;
            boolean zMo104494n = this.f76900d.mo104494n();
            if (fM104492D > 0.0f) {
                if (!zMo104494n) {
                    vImage.setVisibility(0);
                    vImage2.setVisibility(4);
                    vImage.setAlpha(fM104492D);
                }
                if (z) {
                    this.f76902f = true;
                    this.f76903g = false;
                }
            } else if (fM104492D < 0.0f) {
                if (!zMo104494n) {
                    vImage.setVisibility(4);
                    vImage2.setVisibility(0);
                    vImage2.setAlpha(-fM104492D);
                }
                if (z) {
                    this.f76902f = false;
                    this.f76903g = true;
                }
            } else {
                if (!zMo104494n) {
                    vImage.setVisibility(4);
                    vImage2.setVisibility(4);
                }
                if (z) {
                    this.f76902f = false;
                    this.f76903g = false;
                }
            }
            if (z) {
                this.f76901e = Math.abs(f) > width;
            }
        } else if (i == 1 && z) {
            View view = abstractC0569e0.itemView;
            if ((view instanceof IntlMeetFakeLikersItem) || (view instanceof IntlMeetFakeTurboItem)) {
                float fM104492D2 = m104492D(view.getMeasuredWidth(), Math.abs(f) * 2.0f);
                if (f <= 0.0f) {
                    fM104492D2 = -fM104492D2;
                }
                this.f76902f = fM104492D2 > 0.0f;
            }
        }
        if (recyclerView instanceof VPullUpRecyclerView) {
            ((VPullUpRecyclerView) recyclerView).m224435F(abstractC0569e0.itemView);
        }
        super.mo3792u(canvas, recyclerView, abstractC0569e0, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C0607k.e
    /* JADX INFO: renamed from: y */
    public boolean mo3796y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull RecyclerView.AbstractC0569e0 abstractC0569e1) {
        return false;
    }
}
