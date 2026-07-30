package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzRegionChooseView;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VCheckBox;
import p151v.VFrame;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bdc0;
import p153l.bnl0;
import p153l.c4s;
import p153l.c69;
import p153l.ebw;
import p153l.fq3;
import p153l.gq3;
import p153l.haw;
import p153l.jic0;
import p153l.joa;
import p153l.k3d0;
import p153l.mec0;
import p153l.nbw;
import p153l.nqy;
import p153l.p9r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010,\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!¨\u0006-"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/nqy;", OMSTemplateType.dialog, "", "c", "(Lcom/p1/mobile/android/app/Act;Ll/nqy;)V", Constants.INAPP_DATA_TAG, "()V", "Lv/VText;", "a", "Lv/VText;", "get_desc", "()Lv/VText;", "set_desc", "(Lv/VText;)V", "_desc", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "get_recycler_view", "()Lv/VRecyclerView;", "set_recycler_view", "(Lv/VRecyclerView;)V", "_recycler_view", "get_set_up", "set_set_up", "_set_up", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BuzzRegionChooseView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRecyclerView _recycler_view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _set_up;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzRegionChooseView$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;", "", "Ll/gq3;", Item.TYPE, "", "a", "(Ll/gq3;)Z", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC8592a {
        /* JADX INFO: renamed from: a */
        boolean mo48356a(@Nullable gq3 item);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzRegionChooseView$b */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010#R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$b;", "Ll/jic0;", "Ll/gq3;", "", "mData", "", "selectMCC", "<init>", "(Ljava/util/List;I)V", "Landroid/view/ViewGroup;", "parent", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "F", "(Landroid/view/View;Ll/gq3;II)V", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "J", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;)V", "H", "(I)Ll/gq3;", c4s.C_ZONE, "()I", "getItemCount", "c", "Ljava/util/List;", Constants.INAPP_DATA_TAG, "I", "setSelectMCC", "(I)V", "e", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8593b extends jic0<gq3> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public List<gq3> mData;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int selectMCC;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public InterfaceC8592a listener;

        public C8593b(@NotNull List<gq3> list, int i) {
            list.getClass();
            this.mData = list;
            this.selectMCC = i;
        }

        /* JADX INFO: renamed from: G */
        public static final void m48358G(C8593b c8593b, gq3 gq3Var, View view) {
            InterfaceC8592a interfaceC8592a = c8593b.listener;
            if (Intrinsics.m88377d(interfaceC8592a != null ? Boolean.valueOf(interfaceC8592a.mo48356a(gq3Var)) : null, Boolean.TRUE)) {
                c8593b.selectMCC = gq3Var != null ? gq3Var.getMcc() : -1;
                c8593b.notifyDataSetChanged();
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            return this.mData.size();
        }

        @Override // p153l.jic0
        @NotNull
        /* JADX INFO: renamed from: D */
        public View mo29824D(@NotNull ViewGroup parent, int itemViewType) {
            parent.getClass();
            View viewInflate = p9r.m171370a(parent.getContext()).inflate(mec0.f136487v, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }

        @Override // p153l.jic0
        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(@NotNull View convertView, @Nullable final gq3 item, int itemViewType, int position) {
            convertView.getClass();
            VFrame vFrame = convertView instanceof VFrame ? (VFrame) convertView : null;
            TextView textView = vFrame != null ? (TextView) vFrame.findViewById(bdc0.f76252i) : null;
            if (textView == null) {
                textView = null;
            }
            if (textView != null) {
                textView.setText(item != null ? item.getRegionName() : null);
            }
            VCheckBox vCheckBox = vFrame != null ? (VCheckBox) vFrame.findViewById(bdc0.f76251h) : null;
            VCheckBox vCheckBox2 = vCheckBox != null ? vCheckBox : null;
            if (vCheckBox2 != null) {
                boolean z = false;
                if (item != null && item.getMcc() == this.selectMCC) {
                    z = true;
                }
                vCheckBox2.setChecked(z);
            }
            if (vFrame != null) {
                bnl0.m105509E0(vFrame, new View.OnClickListener() { // from class: l.eq3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BuzzRegionChooseView.C8593b.m48358G(this.f95295a, item, view);
                    }
                });
            }
        }

        @Override // p153l.jic0
        @Nullable
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public gq3 getItem(int position) {
            if (position >= this.mData.size()) {
                return null;
            }
            return this.mData.get(position);
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getSelectMCC() {
            return this.selectMCC;
        }

        /* JADX INFO: renamed from: J */
        public final void m48362J(@NotNull InterfaceC8592a listener) {
            listener.getClass();
            this.listener = listener;
        }

        @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mData.size();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzRegionChooseView$c */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$c", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;", "Ll/gq3;", Item.TYPE, "", "a", "(Ll/gq3;)Z", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C8594c implements InterfaceC8592a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ nqy f31055a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f31056b;

        public C8594c(nqy nqyVar, Act act) {
            this.f31055a = nqyVar;
            this.f31056b = act;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzRegionChooseView.InterfaceC8592a
        /* JADX INFO: renamed from: a */
        public boolean mo48356a(gq3 item) {
            nbw.INSTANCE.m162249n0();
            if (item == null) {
                return false;
            }
            if (item.getMcc() == -1 || item.getMcc() == -1 || !c69.m108118d() || !joa.m146386f4()) {
                return true;
            }
            nqy nqyVar = this.f31055a;
            if (nqyVar != null && nqyVar.m164364d()) {
                this.f31055a.m164362b();
            }
            CoreModule.f18273l.m143405a().mo34575qm(this.f31056b, "p_buzz_area_screening_popup,e_buzz_region_choose,click", Privilege.loveBuzz, null);
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzRegionChooseView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(getContext());
        layoutInflaterM171370a.getClass();
        m48353b(layoutInflaterM171370a, this);
    }

    /* JADX INFO: renamed from: a */
    public static void m48352a(C8593b c8593b, nqy nqyVar, View view) {
        nbw.INSTANCE.m162258s0();
        haw.INSTANCE.m134320a().m134272J0(c8593b.getSelectMCC());
        if (nqyVar == null || !nqyVar.m164364d()) {
            return;
        }
        nqyVar.m164362b();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m48353b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM126728b = fq3.m126728b(this, inflater, parent);
        viewM126728b.getClass();
        return viewM126728b;
    }

    /* JADX INFO: renamed from: c */
    public final void m48354c(@NotNull Act act, @Nullable final nqy dialog) {
        act.getClass();
        setOrientation(1);
        haw.Companion companion = haw.INSTANCE;
        LoveBuzzData loveBuzzDataM134315v0 = companion.m134320a().m134315v0();
        final C8593b c8593b = new C8593b(ebw.INSTANCE.m120285g(loveBuzzDataM134315v0 != null ? loveBuzzDataM134315v0.allowedMCCSwitchList : null), companion.m134320a().m134314u0());
        get_recycler_view().setAdapter(c8593b);
        m48355d();
        c8593b.m48362J(new C8594c(dialog, act));
        bnl0.m105509E0(get_set_up(), new View.OnClickListener() { // from class: l.dq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzRegionChooseView.m48352a(c8593b, dialog, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m48355d() {
        LoveBuzzData loveBuzzDataM134315v0 = haw.INSTANCE.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : loveBuzzDataM134315v0.enabledBuzz) {
            if (TextUtils.equals(str, "voiceBuzz")) {
                sb.append(k3d0.m148007c(R$string.f20922O));
                sb.append("/");
            } else if (TextUtils.equals(str, "videoBuzz")) {
                sb.append(k3d0.m148007c(R$string.f20926Q));
                sb.append("/");
            } else if (TextUtils.equals(str, "memojiBuzz")) {
                sb.append(k3d0.m148007c(R$string.f20924P));
                sb.append("/");
            }
        }
        int iLastIndexOf = sb.lastIndexOf("/");
        if (iLastIndexOf > 0) {
            String strSubstring = sb.substring(0, iLastIndexOf);
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            VText vText = get_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM148007c = k3d0.m148007c(R$string.f20920N);
            strM148007c.getClass();
            vText.setText(String.format(strM148007c, Arrays.copyOf(new Object[]{strSubstring}, 1)));
        }
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final VRecyclerView get_recycler_view() {
        VRecyclerView vRecyclerView = this._recycler_view;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_recycler_view");
        return null;
    }

    @NotNull
    public final VText get_set_up() {
        VText vText = this._set_up;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_set_up");
        return null;
    }

    public final void set_desc(@NotNull VText vText) {
        vText.getClass();
        this._desc = vText;
    }

    public final void set_recycler_view(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recycler_view = vRecyclerView;
    }

    public final void set_set_up(@NotNull VText vText) {
        vText.getClass();
        this._set_up = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzRegionChooseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
