package p153l;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionItemData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionOptionItemData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionOptionUIData;
import com.p051p1.mobile.putong.core.data.IntlMarketQuestionUIData;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.p058ui.intloperation.common.SelectorView;
import com.p051p1.mobile.putong.core.p058ui.intloperation.quiz.IntlQuizAnswerItem;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002efB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010(J/\u0010-\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR$\u0010\\\u001a\u0004\u0018\u00010U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006g"}, m88121d2 = {"Ll/w9p;", "Ll/jic0;", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionItemData;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "convertView", Item.TYPE, "H", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/IntlMarketQuestionItemData;II)V", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionUIData;", "summaryData", "", "questionsData", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionUIData;", "optionUi", LovePlanetStage.result, "M", "(Lcom/p1/mobile/putong/core/data/IntlMarketQuestionUIData;Ljava/util/List;Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionUIData;Ljava/util/List;)V", "J", "(I)Lcom/p1/mobile/putong/core/data/IntlMarketQuestionItemData;", c4s.C_ZONE, "()I", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionItemData;", Option.TYPE, "Ll/lme0;", "singleGroup", "I", "(Lcom/p1/mobile/putong/core/data/IntlMarketQuestionItemData;Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionItemData;Ll/lme0;I)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_question_root", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_question_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_question_root", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "L", "()Landroid/widget/TextView;", "set_question_content_title", "(Landroid/widget/TextView;)V", "_question_content_title", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "K", "()Landroid/widget/LinearLayout;", "set_question_answer_root", "(Landroid/widget/LinearLayout;)V", "_question_answer_root", "", "g", "Ljava/util/List;", "data", "h", "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionOptionUIData;", "optionUiData", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/data/IntlMarketQuestionUIData;", "j", "Ll/w9p$b;", "k", "Ll/w9p$b;", "getOnOptionItemSelected", "()Ll/w9p$b;", BloodType.f39576O, "(Ll/w9p$b;)V", "onOptionItemSelected", "Ll/w9p$a;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/w9p$a;", "getOnOptionItemClick", "()Ll/w9p$a;", "N", "(Ll/w9p$a;)V", "onOptionItemClick", "b", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class w9p extends jic0<IntlMarketQuestionItemData> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ConstraintLayout _question_root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _question_content_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayout _question_answer_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public List<? extends IntlMarketQuestionItemData> data;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public IntlMarketQuestionOptionUIData optionUiData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public IntlMarketQuestionUIData summaryData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public List<Integer> result;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public InterfaceC21053b onOptionItemSelected;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public InterfaceC21052a onOptionItemClick;

    /* JADX INFO: renamed from: l.w9p$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/w9p$a;", "", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC21052a {
        /* JADX INFO: renamed from: a */
        void mo180652a(int position, int oid);
    }

    /* JADX INFO: renamed from: l.w9p$b */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/w9p$b;", "", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC21053b {
        /* JADX INFO: renamed from: a */
        void mo180650a(int position, int oid);
    }

    public w9p(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
        this.result = new ArrayList();
    }

    /* JADX INFO: renamed from: E */
    public static Unit m205611E(w9p w9pVar, int i, IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, SelectorView selectorView, boolean z) {
        InterfaceC21053b interfaceC21053b;
        selectorView.getClass();
        if (z && (interfaceC21053b = w9pVar.onOptionItemSelected) != null) {
            interfaceC21053b.mo180650a(i, intlMarketQuestionOptionItemData.oid);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static void m205612F(w9p w9pVar, int i, IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData, View view) {
        view.getClass();
        IntlQuizAnswerItem intlQuizAnswerItem = (IntlQuizAnswerItem) view;
        if (intlQuizAnswerItem.getIsSelecting()) {
            return;
        }
        lme0 group = intlQuizAnswerItem.getGroup();
        if (group != null) {
            group.m154858g((SelectorView) view);
        }
        InterfaceC21052a interfaceC21052a = w9pVar.onOptionItemClick;
        if (interfaceC21052a != null) {
            interfaceC21052a.mo180652a(i, intlMarketQuestionOptionItemData.oid);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.data.size();
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo29824D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
        layoutInflaterFrom.getClass();
        return m205613G(layoutInflaterFrom, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m205613G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM209808b = x9p.m209808b(this, inflater, parent);
        viewM209808b.getClass();
        return viewM209808b;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @Nullable IntlMarketQuestionItemData item, int itemViewType, int position) {
        convertView.getClass();
        if (item != null) {
            try {
                m205618L().setText(item.desc);
                TextView textViewM205618L = m205618L();
                IntlMarketQuestionUIData intlMarketQuestionUIData = this.summaryData;
                if (intlMarketQuestionUIData == null) {
                    Intrinsics.m88391r("summaryData");
                    intlMarketQuestionUIData = null;
                }
                textViewM205618L.setTextColor(Color.parseColor(intlMarketQuestionUIData.font_color));
                lme0 lme0Var = new lme0();
                lme0Var.m154859h(lme0.INSTANCE.m154861a());
                m205617K().removeAllViews();
                for (IntlMarketQuestionOptionItemData intlMarketQuestionOptionItemData : item.options) {
                    intlMarketQuestionOptionItemData.getClass();
                    m205615I(item, intlMarketQuestionOptionItemData, lme0Var, position);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m205615I(IntlMarketQuestionItemData item, final IntlMarketQuestionOptionItemData option, lme0 singleGroup, final int position) {
        lme0 group;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (m205617K().getChildCount() > 0) {
            layoutParams.topMargin = qa00.f156326m;
        }
        IntlQuizAnswerItem intlQuizAnswerItem = new IntlQuizAnswerItem(this.act);
        intlQuizAnswerItem.setOnSelectChange(new Function2() { // from class: l.u9p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return w9p.m205611E(this.f178125a, position, option, (SelectorView) obj, ((Boolean) obj2).booleanValue());
            }
        });
        intlQuizAnswerItem.setClipChildren(false);
        intlQuizAnswerItem.setBackgroundColor(0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
        layoutInflaterFrom.getClass();
        intlQuizAnswerItem.addView(intlQuizAnswerItem.m47508k(layoutInflaterFrom, intlQuizAnswerItem));
        IntlMarketQuestionOptionUIData intlMarketQuestionOptionUIData = this.optionUiData;
        if (intlMarketQuestionOptionUIData == null) {
            Intrinsics.m88391r("optionUiData");
            intlMarketQuestionOptionUIData = null;
        }
        intlQuizAnswerItem.m47509l(option, intlMarketQuestionOptionUIData);
        m205617K().addView(intlQuizAnswerItem, layoutParams);
        intlQuizAnswerItem.setGroup(singleGroup);
        bnl0.m105509E0(intlQuizAnswerItem, new View.OnClickListener() { // from class: l.v9p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w9p.m205612F(this.f183012a, position, option, view);
            }
        });
        if (this.result.get(position).intValue() != option.oid || (group = intlQuizAnswerItem.getGroup()) == null) {
            return;
        }
        group.m154858g(intlQuizAnswerItem);
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public IntlMarketQuestionItemData getItem(int position) {
        return this.data.get(position);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LinearLayout m205617K() {
        LinearLayout linearLayout = this._question_answer_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_question_answer_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m205618L() {
        TextView textView = this._question_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_question_content_title");
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m205619M(@NotNull IntlMarketQuestionUIData summaryData, @NotNull List<IntlMarketQuestionItemData> questionsData, @NotNull IntlMarketQuestionOptionUIData optionUi, @NotNull List<Integer> result) {
        summaryData.getClass();
        questionsData.getClass();
        optionUi.getClass();
        result.getClass();
        this.data = questionsData;
        this.optionUiData = optionUi;
        this.summaryData = summaryData;
        this.result = result;
    }

    /* JADX INFO: renamed from: N */
    public final void m205620N(@Nullable InterfaceC21052a interfaceC21052a) {
        this.onOptionItemClick = interfaceC21052a;
    }

    /* JADX INFO: renamed from: O */
    public final void m205621O(@Nullable InterfaceC21053b interfaceC21053b) {
        this.onOptionItemSelected = interfaceC21053b;
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0569e0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
