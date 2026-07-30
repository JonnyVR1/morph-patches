package p009l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p002ui.intl.visitor.IntlVisitorAdmobItemView;
import com.p000p1.mobile.putong.core.p002ui.intl.visitor.IntlVisitorsItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.IntlVisitor;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import l.dac0;
import l.f6c0;
import l.lsi0;
import l.vwb;
import l.xma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0019\u0018\u0000 ?2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\t¢\u0006\u0004\b2\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00107R\u0016\u0010,\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010/\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Ll/ump;", "Ll/dac0;", "Lcom/p1/mobile/putong/core/data/IntlVisitor;", "Lcom/p1/mobile/android/app/Act;", "act", "Ll/eop;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/eop;)V", "", "G", "()V", "", "pos", "", "J", "(I)Z", "C", "()I", "position", "I", "(I)Lcom/p1/mobile/putong/core/data/IntlVisitor;", "", "getItemId", "(I)J", "Landroid/view/ViewGroup;", "parent", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", "item", "E", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/IntlVisitor;II)V", "getItemViewType", "(I)I", "i", "e", "(I)V", "", "visitorItems", "L", "(Ljava/util/List;)V", "hasPrivilege", "K", "(Z)V", "adView", "F", "(Lcom/p1/mobile/putong/core/data/IntlVisitor;Landroid/view/View;)V", "H", "c", "Lcom/p1/mobile/android/app/Act;", "d", "Ll/eop;", "Ljava/util/List;", "f", "Z", "g", "Landroid/view/View;", "h", "Lcom/p1/mobile/putong/core/data/IntlVisitor;", "adFakeItem", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ump extends dac0<IntlVisitor> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final eop presenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<? extends IntlVisitor> visitorItems;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasPrivilege;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View adView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public IntlVisitor adFakeItem;

    public ump(@NotNull Act act, @NotNull eop eopVar) {
        act.getClass();
        eopVar.getClass();
        this.act = act;
        this.presenter = eopVar;
        this.visitorItems = new ArrayList();
        boolean z = false;
        if (!CoreModule.c.p0.g3() ? !xma.e4() : !xma.h4()) {
            z = true;
        }
        this.hasPrivilege = z;
    }

    /* JADX INFO: renamed from: G */
    private final void m23071G() {
        if (vwb.J(this.visitorItems) || this.adFakeItem == null) {
            return;
        }
        List<? extends IntlVisitor> list = this.visitorItems;
        list.getClass();
        TypeIntrinsics.a((ArrayList) list).remove(this.adFakeItem);
        m23078H();
    }

    /* JADX INFO: renamed from: J */
    private final boolean m23072J(int pos) {
        if (pos >= this.visitorItems.size()) {
            return false;
        }
        IntlVisitor intlVisitor = this.visitorItems.get(pos);
        return NullChecker.a(intlVisitor) && TextUtils.equals(intlVisitor.id, "fake_visitor_list_admob_id");
    }

    /* JADX INFO: renamed from: C */
    public int m23074C() {
        return this.visitorItems.size();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public View m23075D(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        Act act = this.act;
        if (itemViewType == 2) {
            View viewInflate = act.inflater().inflate(f6c0.Y5, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }
        View viewInflate2 = act.inflater().inflate(f6c0.Z5, parent, false);
        viewInflate2.getClass();
        return viewInflate2;
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m23073A(@NotNull View convertView, @NotNull IntlVisitor item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 2) {
            View view = this.adView;
            if (view != null) {
                ((IntlVisitorAdmobItemView) convertView).m8267b(view);
                return;
            }
            return;
        }
        IntlVisitorsItemView intlVisitorsItemView = (IntlVisitorsItemView) convertView;
        String str = item.id;
        str.getClass();
        intlVisitorsItemView.m8280h(item, str, this.hasPrivilege, position == 0);
    }

    /* JADX INFO: renamed from: F */
    public final void m23077F(@NotNull IntlVisitor item, @Nullable View adView) {
        item.getClass();
        if (this.hasPrivilege) {
            return;
        }
        this.adView = adView;
        this.adFakeItem = item;
        List<? extends IntlVisitor> list = this.visitorItems;
        list.getClass();
        ArrayList arrayList = (ArrayList) list;
        int size = this.visitorItems.size() >= 4 ? 3 : this.visitorItems.size();
        arrayList.add(size, item);
        notifyItemInserted(size);
    }

    /* JADX INFO: renamed from: H */
    public final void m23078H() {
        if (this.adView != null) {
            this.adFakeItem = null;
            this.adView = null;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public IntlVisitor getItem(int position) {
        return this.visitorItems.get(position);
    }

    /* JADX INFO: renamed from: K */
    public final void m23080K(boolean hasPrivilege) {
        if (this.hasPrivilege != hasPrivilege) {
            this.hasPrivilege = hasPrivilege;
            if (hasPrivilege) {
                m23071G();
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m23081L(@NotNull List<? extends IntlVisitor> visitorItems) {
        visitorItems.getClass();
        this.visitorItems = visitorItems;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: e */
    public void m23082e(int i) {
        if (!this.visitorItems.isEmpty() && i == this.visitorItems.size() - 2 && this.presenter.getCouldLoadMore()) {
            if (Network.isConnected(this.presenter.act())) {
                eop.m14025S0(this.presenter, false, 1, null);
            } else {
                lsi0.w(R.string.p4);
            }
        }
    }

    public long getItemId(int position) {
        return position;
    }

    public int getItemViewType(int position) {
        return m23072J(position) ? 2 : 1;
    }
}
