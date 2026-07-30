package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogStateItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class qoh extends dac0<Emotion> {

    /* JADX INFO: renamed from: c */
    public Act f155566c;

    /* JADX INFO: renamed from: d */
    public String f155567d;

    /* JADX INFO: renamed from: e */
    public String f155568e;

    /* JADX INFO: renamed from: g */
    public Emotion f155570g;

    /* JADX INFO: renamed from: h */
    public InterfaceC19547b f155571h;

    /* JADX INFO: renamed from: f */
    public List<Emotion> f155569f = new ArrayList();

    /* JADX INFO: renamed from: i */
    public l80<Emotion> f155572i = new C19546a();

    /* JADX INFO: renamed from: l.qoh$a */
    public class C19546a extends l80<Emotion> {
        public C19546a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo63937k(Emotion emotion, int i, View view) {
            zvf0.m220368A("e_set_my_state_type", qoh.this.f155567d, vwb.m200311Y("state_type_id", emotion.f38748id));
        }
    }

    /* JADX INFO: renamed from: l.qoh$b */
    public interface InterfaceC19547b {
        /* JADX INFO: renamed from: e */
        void mo122857e(Emotion emotion);
    }

    public qoh(Act act, String str, String str2) {
        this.f155566c = act;
        this.f155567d = str;
        this.f155568e = str2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        if (vwb.m200296J(this.f155569f)) {
            return 0;
        }
        return this.f155569f.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return this.f155566c.inflater().inflate(o6c0.f142232l2, viewGroup, false);
        }
        View view = new View(this.f155566c);
        view.setLayoutParams(new RecyclerView.C0578p(t100.f167276y, t100.f167252a));
        return view;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final Emotion emotion, int i, int i2) {
        if (i == 2) {
            FeedPoiDialogStateItem feedPoiDialogStateItem = (FeedPoiDialogStateItem) view;
            feedPoiDialogStateItem.m65015Q(emotion, m175743I(emotion));
            xdl0.m208329E0(feedPoiDialogStateItem, new View.OnClickListener() { // from class: l.poh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f150504a.m175744J(emotion, view2);
                }
            });
            this.f155572i.m148839h(view, emotion, i2);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Emotion getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f155569f.get(i - 1);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m175743I(Emotion emotion) {
        Emotion emotion2 = this.f155570g;
        if (emotion2 == null || emotion == null) {
            return false;
        }
        return TextUtils.equals(emotion2.f38748id, emotion.f38748id);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m175744J(Emotion emotion, View view) {
        m175747M(emotion);
    }

    /* JADX INFO: renamed from: K */
    public void m175745K(List<Emotion> list, Emotion emotion) {
        this.f155569f = list;
        this.f155570g = emotion;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m175746L(InterfaceC19547b interfaceC19547b) {
        this.f155571h = interfaceC19547b;
    }

    /* JADX INFO: renamed from: M */
    public void m175747M(Emotion emotion) {
        if (emotion == null) {
            return;
        }
        Emotion emotion2 = this.f155570g;
        if (emotion2 == null || !TextUtils.equals(emotion2.f38748id, emotion.f38748id)) {
            this.f155570g = emotion;
            notifyDataSetChanged();
            if (NullChecker.m81303a(this.f155571h)) {
                this.f155571h.mo122857e(this.f155570g);
            }
            zvf0.m220399u("e_set_my_state_type", this.f155567d, vwb.m200311Y("state_type_id", emotion.f38748id));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f155572i.m148842o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f155572i.m148842o();
    }
}
