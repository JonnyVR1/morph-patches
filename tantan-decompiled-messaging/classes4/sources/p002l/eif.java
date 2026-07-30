package p002l;

import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputCar;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputCompany;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputDrinking;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputEmpty;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputFitness;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputFoodFlavor;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputFriendPurpose;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputGameLevel;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputGameName;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputGameTogether;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputGameVoice;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHangouts;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHeight;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHomeTown;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHouse;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputIncome;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputMyLife;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputMyQuestion;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputPet;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputProfession;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputQualification;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputSchoolNew;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputSignature;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputSmoking;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputVerification;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import java.util.ArrayList;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eif {
    public eif(whf whfVar) {
    }

    /* JADX INFO: renamed from: c */
    public String m12563c(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS ? "全部完成即可解锁精选" : "";
    }

    /* JADX INFO: renamed from: d */
    public String m12564d(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, String str) {
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            return "mytab_complete_card";
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            return "selected_users_complete_profile";
        }
        return loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CARD_GUIDE_IMPROVE_PROFILE ? "invisible_answer" : "edit_profile";
    }

    /* JADX INFO: renamed from: e */
    public ArrayList<ExpLoopInputType> m12565e(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, @Nullable ExpLoopInputType expLoopInputType) {
        ExpLoopInputType expLoopInputEmpty = expLoopInputType == null ? new ExpLoopInputEmpty() : expLoopInputType;
        ArrayList<ExpLoopInputType> arrayList = new ArrayList<>();
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT) {
            arrayList.addAll(vwb.f0(new ExpLoopInputType[]{new ExpLoopInputSignature(), new ExpLoopInputMyQuestion(), new ExpLoopInputFriendPurpose(), new ExpLoopInputHeight(), new ExpLoopInputProfession(), new ExpLoopInputCompany(), new ExpLoopInputSchoolNew(), new ExpLoopInputQualification(), new ExpLoopInputHomeTown(), new ExpLoopInputHangouts(), new ExpLoopInputFitness(), new ExpLoopInputDrinking(), new ExpLoopInputSmoking(), new ExpLoopInputIncome(), new ExpLoopInputCar(), new ExpLoopInputHouse(), new ExpLoopInputGameName(), new ExpLoopInputGameTogether(), new ExpLoopInputGameLevel(), new ExpLoopInputGameVoice(), new ExpLoopInputFoodFlavor(), new ExpLoopInputPet()}));
            return m12567g(arrayList, expLoopInputEmpty);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            arrayList.addAll(vwb.f0(new ExpLoopInputType[]{new ExpLoopInputSignature(), new ExpLoopInputMyLife(), new ExpLoopInputVerification()}));
            m12568h(arrayList, expLoopInputEmpty);
            return arrayList;
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CARD_GUIDE_IMPROVE_PROFILE) {
            if (expLoopInputEmpty.inputTypeName == 8) {
                return vwb.f0(new ExpLoopInputType[]{new ExpLoopInputGameTogether().setSelectInfoUserId(((ExpLoopInputGameName) expLoopInputEmpty).selectInfoUserId).setSubTitle(expLoopInputEmpty.subTitle)});
            }
        } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            return vwb.f0(new ExpLoopInputType[]{new ExpLoopInputProfession(), new ExpLoopInputQualification(), new ExpLoopInputHomeTown(), new ExpLoopInputFriendPurpose(), new ExpLoopInputHeight(), new ExpLoopInputSignature().setNeedCount(15), new ExpLoopInputMyLife(), new ExpLoopInputVerification().setSubTitle("精选专区的用户均已通过头像本人认证，希望你也可以使用真实头像和他们交友")});
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public Boolean m12566f(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType) {
        return loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList<ExpLoopInputType> m12567g(ArrayList<ExpLoopInputType> arrayList, final ExpLoopInputType expLoopInputType) {
        int iG = vwb.G(arrayList, new w9j() { // from class: l.cif
            public final Object call(Object obj) {
                return Boolean.valueOf(expLoopInputType.inputTypeName == ((ExpLoopInputType) obj).inputTypeName);
            }
        });
        if (iG < 0) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(arrayList);
        ArrayList<ExpLoopInputType> arrayList3 = new ArrayList<>(arrayList2.subList(iG, arrayList.size() + iG));
        arrayList3.remove(0);
        return arrayList3;
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList<ExpLoopInputType> m12568h(ArrayList<ExpLoopInputType> arrayList, final ExpLoopInputType expLoopInputType) {
        int iG = vwb.G(arrayList, new w9j() { // from class: l.dif
            public final Object call(Object obj) {
                return Boolean.valueOf(expLoopInputType.inputTypeName == ((ExpLoopInputType) obj).inputTypeName);
            }
        });
        if (iG >= 0) {
            arrayList.remove(iG);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public Boolean m12569i(LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, ExpLoopInputType expLoopInputType) {
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT) {
            return Boolean.TRUE;
        }
        return (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT && expLoopInputType.inputTypeName == 25) ? Boolean.TRUE : Boolean.FALSE;
    }
}
