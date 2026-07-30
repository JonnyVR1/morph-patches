package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import l.b8c;
import l.d30;
import l.f8c;
import l.orh0;
import l.pp2;
import l.rpq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ui5 extends b8c implements pp2<CommonData> {

    /* JADX INFO: renamed from: c */
    public orh0<DbLinks> f23550c;

    /* JADX INFO: renamed from: d */
    public y9k0 f23551d;

    /* JADX INFO: renamed from: c */
    public int m25221c() {
        return 32;
    }

    /* JADX INFO: renamed from: d */
    public int m25222d() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public String m25223e() {
        return "commonDb";
    }

    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> m25224f() {
        return super.f();
    }

    /* JADX INFO: renamed from: g */
    public void m25225g() {
        rpq.b().e(CommonData.JSON_ADAPTER, this);
    }

    /* JADX INFO: renamed from: h */
    public void m25226h() {
        this.f23550c = new orh0<>(this, "links", DbLinks.DB_ADAPTER, (List) null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        this.f23551d = new y9k0(this, "users", User.DB_ADAPTER, null, AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
    }

    /* JADX INFO: renamed from: i */
    public void m25227i() {
        super.i();
        rpq.b().i(this, CommonData.JSON_ADAPTER);
    }

    /* JADX INFO: renamed from: j */
    public void m25228j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN inactivated_c INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_country_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_province_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_city_c BLOB");
            case CameraSticker.STATE_COMPLETE /* 3 */:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_profile_zodiac_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_status_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_gender_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_membership_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_source_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_membership_vipBadgeType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_profile_studies_qualification_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_location_invisibleFields_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_profile_extensions_physical_bloodType_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_profile_extensions_basic_friendPurpose_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN str_profile_extensions_friendStatus_status_c BLOB");
            case CameraSticker.STATE_ERROR /* 4 */:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_momentSwitch_noSyncMoment_c BLOB");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_wealth_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_qualification_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_physical_height_c BLOB");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_profileCompletion_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_voiceSignature_c BLOB");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN activityUser_action_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN activityUser_score_c INTEGER");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN matePlanUser_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN matePlanAdUser_c INTEGER");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN regionTag_c TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN localLikeIdentifiers_c BLOB");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN deleted_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_interest_tags_c BLOB");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_live_voiceImgId_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_live_voiceImgUrl_c BLOB");
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_mate_c BLOB");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_pet_c BLOB");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_tailFrame_url_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_tailFrame_expiredTime_c BLOB");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_business_avatarID_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_business_avatarExpireTime_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_business_avatarClose_c BLOB");
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN specialEffect_c BLOB");
            case 18:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_ethnicity_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_language_c BLOB");
            case 19:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_voiceAvatarFrame_c BLOB");
            case 20:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_physical_heightImg_c BLOB");
            case 21:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_marriage_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_address_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_familyBackground_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_physical_weight_c BLOB");
            case 22:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN verifications_others_otherCTDID_verified_c INTEGER");
            case 23:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_game_c BLOB");
            case 24:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_facialFeature_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN verifications_idCard_age_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN verifications_idCard_first4_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_physical_fitness_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_physical_drink_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_physical_smoke_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_mbti_c BLOB");
            case 25:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN userActivityInfo_c BLOB");
            case 26:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_ideal_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_unideal_c BLOB");
            case 27:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_moments_counters_totalNormalMoments_c INTEGER");
            case 28:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_interest_taste_c BLOB");
            case 29:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN location_region_province_c TEXT");
            case 30:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_intlFriendPurpose_c BLOB");
            case 31:
                sQLiteDatabase.execSQL("ALTER TABLE " + ((orh0) this.f23551d).d + " ADD COLUMN profile_extensions_basic_intlFriendPurposeV2_c BLOB");
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m25229l(DbLinks dbLinks) {
        this.f23550c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: n */
    public void m25231n(final DbLinks dbLinks) {
        f8c.o().B(new d30() { // from class: l.ti5
            public final void call() {
                this.f22124a.m25229l(dbLinks);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public void m25220b(Envelope envelope) {
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m25219a(Envelope envelope, CommonData commonData, boolean z, boolean z2, boolean z3) {
    }
}
