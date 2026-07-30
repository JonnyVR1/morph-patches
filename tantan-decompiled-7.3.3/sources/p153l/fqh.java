package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogStateItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class fqh extends jic0<Emotion> {

    /* JADX INFO: renamed from: c */
    public Act f100291c;

    /* JADX INFO: renamed from: d */
    public String f100292d;

    /* JADX INFO: renamed from: e */
    public String f100293e;

    /* JADX INFO: renamed from: g */
    public Emotion f100295g;

    /* JADX INFO: renamed from: h */
    public InterfaceC17031b f100296h;

    /* JADX INFO: renamed from: f */
    public List<Emotion> f100294f = new ArrayList();

    /* JADX INFO: renamed from: i */
    public h80<Emotion> f100297i = new C17030a();

    /* JADX INFO: renamed from: l.fqh$a */
    public class C17030a extends h80<Emotion> {
        public C17030a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo65120k(Emotion emotion, int i, View view) {
            i4g0.m138492A("e_set_my_state_type", fqh.this.f100292d, jyb.m147494Y("state_type_id", emotion.f39596id));
        }
    }

    /* JADX INFO: renamed from: l.fqh$b */
    public interface InterfaceC17031b {
        /* JADX INFO: renamed from: e */
        void mo126760e(Emotion emotion);
    }

    public fqh(Act act, String str, String str2) {
        this.f100291c = act;
        this.f100292d = str;
        this.f100293e = str2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (jyb.m147479J(this.f100294f)) {
            return 0;
        }
        return this.f100294f.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return this.f100291c.inflater().inflate(tec0.f173701l2, viewGroup, false);
        }
        View view = new View(this.f100291c);
        view.setLayoutParams(new RecyclerView.C0580p(qa00.f156338y, qa00.f156314a));
        return view;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final Emotion emotion, int i, int i2) {
        if (i == 2) {
            FeedPoiDialogStateItem feedPoiDialogStateItem = (FeedPoiDialogStateItem) view;
            feedPoiDialogStateItem.m66198Q(emotion, m126754I(emotion));
            bnl0.m105509E0(feedPoiDialogStateItem, new View.OnClickListener() { // from class: l.eqh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f95343a.m126755J(emotion, view2);
                }
            });
            this.f100297i.m133881h(view, emotion, i2);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Emotion getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f100294f.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m126754I(Emotion emotion) {
        Emotion emotion2 = this.f100295g;
        if (emotion2 == null || emotion == null) {
            return false;
        }
        return TextUtils.equals(emotion2.f39596id, emotion.f39596id);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m126755J(Emotion emotion, View view) {
        m126758M(emotion);
    }

    /* JADX INFO: renamed from: K */
    public void m126756K(List<Emotion> list, Emotion emotion) {
        this.f100294f = list;
        this.f100295g = emotion;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m126757L(InterfaceC17031b interfaceC17031b) {
        this.f100296h = interfaceC17031b;
    }

    /* JADX INFO: renamed from: M */
    public void m126758M(Emotion emotion) {
        if (emotion == null) {
            return;
        }
        Emotion emotion2 = this.f100295g;
        if (emotion2 == null || !TextUtils.equals(emotion2.f39596id, emotion.f39596id)) {
            this.f100295g = emotion;
            notifyDataSetChanged();
            if (NullChecker.m82486a(this.f100296h)) {
                this.f100296h.mo126760e(this.f100295g);
            }
            i4g0.m138523u("e_set_my_state_type", this.f100292d, jyb.m147494Y("state_type_id", emotion.f39596id));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewAttachedToWindow(abstractC0569e0);
        this.f100297i.m133884o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        super.onViewDetachedFromWindow(abstractC0569e0);
        this.f100297i.m133884o();
    }
}
