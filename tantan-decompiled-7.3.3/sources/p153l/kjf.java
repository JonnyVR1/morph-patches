package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputCar;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputCompany;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputDrinking;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputEmpty;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputFitness;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputFoodFlavor;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputFriendPurpose;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputGameLevel;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputGameName;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputGameTogether;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputGameVoice;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputHangouts;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputHeight;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputHomeTown;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputHouse;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputIncome;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputMyLife;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputMyQuestion;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputPet;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputProfession;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputQualification;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputSchoolNew;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputSignature;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputSmoking;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputVerification;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class kjf {
    public kjf(cjf cjfVar) {
    }

    /* JADX INFO: renamed from: c */
    public String m150036c(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS ? "全部完成即可解锁精选" : "";
    }

    /* JADX INFO: renamed from: d */
    public String m150037d(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, String str) {
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            return "mytab_complete_card";
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            return "selected_users_complete_profile";
        }
        return loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CARD_GUIDE_IMPROVE_PROFILE ? "invisible_answer" : "edit_profile";
    }

    /* JADX INFO: renamed from: e */
    public ArrayList<ExpLoopInputType> m150038e(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, @Nullable ExpLoopInputType expLoopInputType) {
        ExpLoopInputType expLoopInputEmpty = expLoopInputType == null ? new ExpLoopInputEmpty() : expLoopInputType;
        ArrayList<ExpLoopInputType> arrayList = new ArrayList<>();
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT) {
            arrayList.addAll(jyb.m147507f0(new ExpLoopInputSignature(), new ExpLoopInputMyQuestion(), new ExpLoopInputFriendPurpose(), new ExpLoopInputHeight(), new ExpLoopInputProfession(), new ExpLoopInputCompany(), new ExpLoopInputSchoolNew(), new ExpLoopInputQualification(), new ExpLoopInputHomeTown(), new ExpLoopInputHangouts(), new ExpLoopInputFitness(), new ExpLoopInputDrinking(), new ExpLoopInputSmoking(), new ExpLoopInputIncome(), new ExpLoopInputCar(), new ExpLoopInputHouse(), new ExpLoopInputGameName(), new ExpLoopInputGameTogether(), new ExpLoopInputGameLevel(), new ExpLoopInputGameVoice(), new ExpLoopInputFoodFlavor(), new ExpLoopInputPet()));
            return m150040g(arrayList, expLoopInputEmpty);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            arrayList.addAll(jyb.m147507f0(new ExpLoopInputSignature(), new ExpLoopInputMyLife(), new ExpLoopInputVerification()));
            m150041h(arrayList, expLoopInputEmpty);
            return arrayList;
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CARD_GUIDE_IMPROVE_PROFILE) {
            if (expLoopInputEmpty.inputTypeName == 8) {
                return jyb.m147507f0(new ExpLoopInputGameTogether().setSelectInfoUserId(((ExpLoopInputGameName) expLoopInputEmpty).selectInfoUserId).setSubTitle(expLoopInputEmpty.subTitle));
            }
        } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            return jyb.m147507f0(new ExpLoopInputProfession(), new ExpLoopInputQualification(), new ExpLoopInputHomeTown(), new ExpLoopInputFriendPurpose(), new ExpLoopInputHeight(), new ExpLoopInputSignature().setNeedCount(15), new ExpLoopInputMyLife(), new ExpLoopInputVerification().setSubTitle("精选专区的用户均已通过头像本人认证，希望你也可以使用真实头像和他们交友"));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public Boolean m150039f(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList<ExpLoopInputType> m150040g(ArrayList<ExpLoopInputType> arrayList, final ExpLoopInputType expLoopInputType) {
        int iM147476G = jyb.m147476G(arrayList, new qcj() { // from class: l.ijf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(expLoopInputType.inputTypeName == ((ExpLoopInputType) obj).inputTypeName);
            }
        });
        if (iM147476G < 0) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(arrayList);
        ArrayList<ExpLoopInputType> arrayList3 = new ArrayList<>(arrayList2.subList(iM147476G, arrayList.size() + iM147476G));
        arrayList3.remove(0);
        return arrayList3;
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList<ExpLoopInputType> m150041h(ArrayList<ExpLoopInputType> arrayList, final ExpLoopInputType expLoopInputType) {
        int iM147476G = jyb.m147476G(arrayList, new qcj() { // from class: l.jjf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(expLoopInputType.inputTypeName == ((ExpLoopInputType) obj).inputTypeName);
            }
        });
        if (iM147476G >= 0) {
            arrayList.remove(iM147476G);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public Boolean m150042i(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType) {
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT) {
            return Boolean.TRUE;
        }
        return (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT && expLoopInputType.inputTypeName == 25) ? Boolean.TRUE : Boolean.FALSE;
    }
}
