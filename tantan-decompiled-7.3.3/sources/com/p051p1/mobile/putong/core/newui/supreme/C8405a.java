package com.p051p1.mobile.putong.core.newui.supreme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.newui.supreme.C8405a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.c4s;
import p153l.jic0;
import p153l.pec0;
import p153l.y6b;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.supreme.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000278B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010 \u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R$\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u00020+j\b\u0012\u0004\u0012\u00020\u0002`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010 \u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0018\u00105\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00069"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/a;", "Ll/jic0;", "Ll/y6b$a;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "presenter", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;)V", "Landroid/view/ViewGroup;", "parent", "", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "position", "G", "(I)Ll/y6b$a;", "getItemViewType", "(I)I", c4s.C_ZONE, "()I", "convertView", Item.TYPE, "", "F", "(Landroid/view/View;Ll/y6b$a;II)V", "", "hasIdealTypesSelected", "I", "(Z)V", "", "list", "hasSupremePartner", "H", "(Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/core/newui/supreme/a$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "J", "(Lcom/p1/mobile/putong/core/newui/supreme/a$b;)V", "c", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "getPresenter", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/ArrayList;", "userList", "e", "Z", "f", "g", "Lcom/p1/mobile/putong/core/newui/supreme/a$b;", "clickListener", "Companion", "a", "b", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8405a extends jic0<y6b.C21531a> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SupremeListPresenter presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<y6b.C21531a> userList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean hasSupremePartner;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hasIdealTypesSelected;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public b clickListener;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.supreme.a$b */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/a$b;", "", "Ll/y6b$a;", "supremeSuggestData", "", Constants.INAPP_POSITION, "", "hasSupremePartner", "", "a", "(Ll/y6b$a;IZ)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo44852a(@NotNull y6b.C21531a supremeSuggestData, int pos, boolean hasSupremePartner);
    }

    public C8405a(@NotNull SupremeListPresenter supremeListPresenter) {
        supremeListPresenter.getClass();
        this.presenter = supremeListPresenter;
        this.userList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: E */
    public static void m44860E(C8405a c8405a, y6b.C21531a c21531a, int i, View view) {
        b bVar = c8405a.clickListener;
        if (bVar != null) {
            bVar.mo44852a(c21531a, i, c8405a.hasSupremePartner);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.userList.size() + 2;
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: D */
    public View mo29824D(@Nullable ViewGroup parent, int itemViewType) {
        if (itemViewType == 0) {
            return LayoutInflater.from(this.presenter.act()).inflate(pec0.f151910H1, parent, false);
        }
        if (itemViewType == 1) {
            return LayoutInflater.from(this.presenter.act()).inflate(pec0.f151904F1, parent, false);
        }
        if (itemViewType != 2) {
            return null;
        }
        return LayoutInflater.from(this.presenter.act()).inflate(pec0.f151907G1, parent, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @Nullable final y6b.C21531a item, int itemViewType, final int position) {
        convertView.getClass();
        if (itemViewType == 0) {
            ((SupremeUserHeaderView) convertView).m44858d(this.presenter.act(), this.userList.isEmpty(), this.hasIdealTypesSelected);
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            bnl0.m105524M((SupremeUserFooterView) convertView, !this.userList.isEmpty());
        } else {
            item.getClass();
            ((SupremeListItemView) convertView).m44806e(item, this.hasSupremePartner, this.presenter.getFrag().pageId());
            bnl0.m105522L(convertView, new View.OnClickListener() { // from class: l.o8h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C8405a.m44860E(this.f145411a, item, position, view);
                }
            });
        }
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public y6b.C21531a getItem(int position) {
        if (position == 0 || position == this.userList.size() + 1) {
            return null;
        }
        return this.userList.get(position - 1);
    }

    /* JADX INFO: renamed from: H */
    public final void m44863H(@NotNull List<? extends y6b.C21531a> list, boolean hasSupremePartner) {
        list.getClass();
        this.hasIdealTypesSelected = true;
        this.hasSupremePartner = hasSupremePartner;
        this.userList.clear();
        this.userList.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public final void m44864I(boolean hasIdealTypesSelected) {
        this.hasIdealTypesSelected = hasIdealTypesSelected;
        this.userList.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public final void m44865J(@NotNull b listener) {
        listener.getClass();
        this.clickListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        return position == this.userList.size() + 1 ? 2 : 1;
    }
}
