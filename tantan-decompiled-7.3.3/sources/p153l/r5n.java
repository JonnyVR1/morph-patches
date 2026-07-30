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
import com.p051p1.mobile.putong.core.data.IntlCampingQuestionOptionsData;
import com.p051p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.Option;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.IntlCampingAnswerItem;
import com.p051p1.mobile.putong.core.p058ui.intloperation.common.SelectorView;
import com.p051p1.mobile.putong.data.BloodType;
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
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\\]B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010 \u001a\u00020\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J/\u0010*\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR$\u0010S\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010[\u001a\u0004\u0018\u00010T8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006^"}, m88121d2 = {"Ll/r5n;", "Ll/jic0;", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$e0;I)V", "convertView", Item.TYPE, "H", "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;II)V", "", "questionsData", "", LovePlanetStage.result, "M", "(Ljava/util/List;Ljava/util/List;)V", "J", "(I)Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;", c4s.C_ZONE, "()I", "Lcom/p1/mobile/putong/core/data/IntlCampingQuestionOptionsData;", Option.TYPE, "Ll/lme0;", "singleGroup", "I", "(Lcom/p1/mobile/putong/core/data/IntlCampingQuestionsData;Lcom/p1/mobile/putong/core/data/IntlCampingQuestionOptionsData;Ll/lme0;I)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", Constants.INAPP_DATA_TAG, "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_question_root", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_question_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_question_root", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "L", "()Landroid/widget/TextView;", "set_question_content_title", "(Landroid/widget/TextView;)V", "_question_content_title", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "K", "()Landroid/widget/LinearLayout;", "set_question_answer_root", "(Landroid/widget/LinearLayout;)V", "_question_answer_root", "g", "Ljava/util/List;", "data", "h", "Ll/r5n$b;", RXScreenCaptureService.KEY_INDEX, "Ll/r5n$b;", "getOnOptionItemSelected", "()Ll/r5n$b;", BloodType.f39576O, "(Ll/r5n$b;)V", "onOptionItemSelected", "Ll/r5n$a;", "j", "Ll/r5n$a;", "getOnOptionItemClick", "()Ll/r5n$a;", "N", "(Ll/r5n$a;)V", "onOptionItemClick", "b", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class r5n extends jic0<IntlCampingQuestionsData> {

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
    public List<? extends IntlCampingQuestionsData> data;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<Integer> result;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC19767b onOptionItemSelected;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public InterfaceC19766a onOptionItemClick;

    /* JADX INFO: renamed from: l.r5n$a */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/r5n$a;", "", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC19766a {
        /* JADX INFO: renamed from: a */
        void mo124314a(int position, int oid);
    }

    /* JADX INFO: renamed from: l.r5n$b */
    @Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/r5n$b;", "", "", "position", "oid", "", "a", "(II)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC19767b {
        /* JADX INFO: renamed from: a */
        void mo124313a(int position, int oid);
    }

    public r5n(@NotNull Act act) {
        act.getClass();
        this.act = act;
        this.data = new ArrayList();
        this.result = new ArrayList();
    }

    /* JADX INFO: renamed from: E */
    public static void m179874E(r5n r5nVar, int i, IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, View view) {
        view.getClass();
        IntlCampingAnswerItem intlCampingAnswerItem = (IntlCampingAnswerItem) view;
        if (intlCampingAnswerItem.getIsSelecting()) {
            return;
        }
        lme0 group = intlCampingAnswerItem.getGroup();
        if (group != null) {
            group.m154858g((SelectorView) view);
        }
        InterfaceC19766a interfaceC19766a = r5nVar.onOptionItemClick;
        if (interfaceC19766a != null) {
            interfaceC19766a.mo124314a(i, intlCampingQuestionOptionsData.oid);
        }
    }

    /* JADX INFO: renamed from: F */
    public static Unit m179875F(r5n r5nVar, int i, IntlCampingQuestionOptionsData intlCampingQuestionOptionsData, SelectorView selectorView, boolean z) {
        InterfaceC19767b interfaceC19767b;
        selectorView.getClass();
        if (z && (interfaceC19767b = r5nVar.onOptionItemSelected) != null) {
            interfaceC19767b.mo124313a(i, intlCampingQuestionOptionsData.oid);
        }
        return Unit.INSTANCE;
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
        return m179876G(layoutInflaterFrom, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m179876G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM184742b = s5n.m184742b(this, inflater, parent);
        viewM184742b.getClass();
        return viewM184742b;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@NotNull View convertView, @Nullable IntlCampingQuestionsData item, int itemViewType, int position) {
        convertView.getClass();
        if (item != null) {
            try {
                m179881L().setText(item.heading);
                m179881L().setTextColor(Color.parseColor(item.heading_font_color));
                lme0 lme0Var = new lme0();
                lme0Var.m154859h(lme0.INSTANCE.m154861a());
                m179880K().removeAllViews();
                for (IntlCampingQuestionOptionsData intlCampingQuestionOptionsData : item.options) {
                    intlCampingQuestionOptionsData.getClass();
                    m179878I(item, intlCampingQuestionOptionsData, lme0Var, position);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m179878I(IntlCampingQuestionsData item, final IntlCampingQuestionOptionsData option, lme0 singleGroup, final int position) {
        lme0 group;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (m179880K().getChildCount() > 0) {
            layoutParams.topMargin = qa00.f156326m;
        }
        IntlCampingAnswerItem intlCampingAnswerItem = new IntlCampingAnswerItem(this.act);
        intlCampingAnswerItem.setOnSelectChange(new Function2() { // from class: l.p5n
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return r5n.m179875F(this.f150663a, position, option, (SelectorView) obj, ((Boolean) obj2).booleanValue());
            }
        });
        intlCampingAnswerItem.setClipChildren(false);
        intlCampingAnswerItem.setBackgroundColor(0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.act);
        layoutInflaterFrom.getClass();
        intlCampingAnswerItem.addView(intlCampingAnswerItem.m47436k(layoutInflaterFrom, intlCampingAnswerItem));
        intlCampingAnswerItem.m47437l(option, item);
        m179880K().addView(intlCampingAnswerItem, layoutParams);
        intlCampingAnswerItem.setGroup(singleGroup);
        bnl0.m105509E0(intlCampingAnswerItem, new View.OnClickListener() { // from class: l.q5n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r5n.m179874E(this.f155743a, position, option, view);
            }
        });
        if (this.result.get(position).intValue() != option.oid || (group = intlCampingAnswerItem.getGroup()) == null) {
            return;
        }
        group.m154858g(intlCampingAnswerItem);
    }

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public IntlCampingQuestionsData getItem(int position) {
        return this.data.get(position);
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LinearLayout m179880K() {
        LinearLayout linearLayout = this._question_answer_root;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_question_answer_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final TextView m179881L() {
        TextView textView = this._question_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_question_content_title");
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m179882M(@NotNull List<? extends IntlCampingQuestionsData> questionsData, @NotNull List<Integer> result) {
        questionsData.getClass();
        result.getClass();
        this.data = questionsData;
        this.result = result;
    }

    /* JADX INFO: renamed from: N */
    public final void m179883N(@Nullable InterfaceC19766a interfaceC19766a) {
        this.onOptionItemClick = interfaceC19766a;
    }

    /* JADX INFO: renamed from: O */
    public final void m179884O(@Nullable InterfaceC19767b interfaceC19767b) {
        this.onOptionItemSelected = interfaceC19767b;
    }

    @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.AbstractC0569e0 holder, int position) {
        holder.getClass();
        super.onBindViewHolder(holder, position);
        holder.setIsRecyclable(false);
    }
}
