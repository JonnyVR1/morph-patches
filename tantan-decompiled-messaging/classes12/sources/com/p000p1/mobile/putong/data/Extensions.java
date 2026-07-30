package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Extensions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extensions";

    @NonNull
    @ProtobufIndex(index = 5)
    public Anonymity anonymity;

    @NonNull
    @ProtobufIndex(index = 4)
    public ProfileExtensionBasic basic;

    @NonNull
    @ProtobufIndex(index = 2)
    public Business business;

    @NonNull
    @ProtobufIndex(index = 7)
    public FriendStatus friendStatus;

    @NonNull
    @ProtobufIndex(index = 18)
    public ExtensionGame game;

    @NonNull
    @ProtobufIndex(index = 6)
    public HeadFrame headFrame;

    @NonNull
    @ProtobufIndex(index = 3)
    public Interest interest;

    @NonNull
    @ProtobufIndex(index = 12)
    public VirtualVoiceLive live;

    @NonNull
    @ProtobufIndex(index = 17)
    public ProfileExtensionMarriage marriage;

    @NonNull
    @ProtobufIndex(index = 13)
    public ProfileMate mate;

    @NonNull
    @ProtobufIndex(index = 8)
    public MomentSwitch momentSwitch;

    @NonNull
    @ProtobufIndex(index = 14)
    public PetInfo pet;

    @NonNull
    @ProtobufIndex(index = 1)
    public Physical physical;

    @NonNull
    @ProtobufIndex(index = 10)
    public ProfileCompletion profileCompletion;

    @NonNull
    @ProtobufIndex(index = 15)
    public TailFrame tailFrame;

    @NonNull
    @ProtobufIndex(index = AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP)
    public VoiceAvatarFrame voiceAvatarFrame;

    @NonNull
    @ProtobufIndex(index = 11)
    public VoiceSignature voiceSignature;

    @NonNull
    @ProtobufIndex(index = 9)
    public UserWealth wealth;
    public static ProtobufAdapter<Extensions> PROTOBUF_ADAPTER = new MessageNanoAdapter<Extensions>() { // from class: com.p1.mobile.putong.data.Extensions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Extensions extensions) {
            Physical physical = extensions.physical;
            int iL = physical != null ? CodedOutputByteBufferNano.l(1, physical, Physical.PROTOBUF_ADAPTER) : 0;
            Business business = extensions.business;
            if (business != null) {
                iL += CodedOutputByteBufferNano.l(2, business, Business.PROTOBUF_ADAPTER);
            }
            Interest interest = extensions.interest;
            if (interest != null) {
                iL += CodedOutputByteBufferNano.l(3, interest, Interest.PROTOBUF_ADAPTER);
            }
            ProfileExtensionBasic profileExtensionBasic = extensions.basic;
            if (profileExtensionBasic != null) {
                iL += CodedOutputByteBufferNano.l(4, profileExtensionBasic, ProfileExtensionBasic.PROTOBUF_ADAPTER);
            }
            Anonymity anonymity = extensions.anonymity;
            if (anonymity != null) {
                iL += CodedOutputByteBufferNano.l(5, anonymity, Anonymity.PROTOBUF_ADAPTER);
            }
            HeadFrame headFrame = extensions.headFrame;
            if (headFrame != null) {
                iL += CodedOutputByteBufferNano.l(6, headFrame, HeadFrame.PROTOBUF_ADAPTER);
            }
            FriendStatus friendStatus = extensions.friendStatus;
            if (friendStatus != null) {
                iL += CodedOutputByteBufferNano.l(7, friendStatus, FriendStatus.PROTOBUF_ADAPTER);
            }
            MomentSwitch momentSwitch = extensions.momentSwitch;
            if (momentSwitch != null) {
                iL += CodedOutputByteBufferNano.l(8, momentSwitch, MomentSwitch.PROTOBUF_ADAPTER);
            }
            UserWealth userWealth = extensions.wealth;
            if (userWealth != null) {
                iL += CodedOutputByteBufferNano.l(9, userWealth, UserWealth.PROTOBUF_ADAPTER);
            }
            ProfileCompletion profileCompletion = extensions.profileCompletion;
            if (profileCompletion != null) {
                iL += CodedOutputByteBufferNano.l(10, profileCompletion, ProfileCompletion.PROTOBUF_ADAPTER);
            }
            VoiceSignature voiceSignature = extensions.voiceSignature;
            if (voiceSignature != null) {
                iL += CodedOutputByteBufferNano.l(11, voiceSignature, VoiceSignature.PROTOBUF_ADAPTER);
            }
            VirtualVoiceLive virtualVoiceLive = extensions.live;
            if (virtualVoiceLive != null) {
                iL += CodedOutputByteBufferNano.l(12, virtualVoiceLive, VirtualVoiceLive.PROTOBUF_ADAPTER);
            }
            ProfileMate profileMate = extensions.mate;
            if (profileMate != null) {
                iL += CodedOutputByteBufferNano.l(13, profileMate, ProfileMate.PROTOBUF_ADAPTER);
            }
            PetInfo petInfo = extensions.pet;
            if (petInfo != null) {
                iL += CodedOutputByteBufferNano.l(14, petInfo, PetInfo.PROTOBUF_ADAPTER);
            }
            TailFrame tailFrame = extensions.tailFrame;
            if (tailFrame != null) {
                iL += CodedOutputByteBufferNano.l(15, tailFrame, TailFrame.PROTOBUF_ADAPTER);
            }
            VoiceAvatarFrame voiceAvatarFrame = extensions.voiceAvatarFrame;
            if (voiceAvatarFrame != null) {
                iL += CodedOutputByteBufferNano.l(16, voiceAvatarFrame, VoiceAvatarFrame.PROTOBUF_ADAPTER);
            }
            ProfileExtensionMarriage profileExtensionMarriage = extensions.marriage;
            if (profileExtensionMarriage != null) {
                iL += CodedOutputByteBufferNano.l(17, profileExtensionMarriage, ProfileExtensionMarriage.PROTOBUF_ADAPTER);
            }
            ExtensionGame extensionGame = extensions.game;
            if (extensionGame != null) {
                iL += CodedOutputByteBufferNano.l(18, extensionGame, ExtensionGame.PROTOBUF_ADAPTER);
            }
            ((MessageNano) extensions).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Extensions m18028parse(nb5 nb5Var) throws IOException {
            Extensions extensions = new Extensions();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (extensions.physical == null) {
                            extensions.physical = Physical.new_();
                        }
                        if (extensions.business == null) {
                            extensions.business = Business.new_();
                        }
                        if (extensions.interest == null) {
                            extensions.interest = Interest.new_();
                        }
                        if (extensions.basic == null) {
                            extensions.basic = ProfileExtensionBasic.new_();
                        }
                        if (extensions.anonymity == null) {
                            extensions.anonymity = Anonymity.new_();
                        }
                        if (extensions.headFrame == null) {
                            extensions.headFrame = HeadFrame.new_();
                        }
                        if (extensions.friendStatus == null) {
                            extensions.friendStatus = FriendStatus.new_();
                        }
                        if (extensions.momentSwitch == null) {
                            extensions.momentSwitch = MomentSwitch.new_();
                        }
                        if (extensions.wealth == null) {
                            extensions.wealth = UserWealth.new_();
                        }
                        if (extensions.profileCompletion == null) {
                            extensions.profileCompletion = ProfileCompletion.new_();
                        }
                        if (extensions.voiceSignature == null) {
                            extensions.voiceSignature = VoiceSignature.new_();
                        }
                        if (extensions.live == null) {
                            extensions.live = VirtualVoiceLive.new_();
                        }
                        if (extensions.mate == null) {
                            extensions.mate = ProfileMate.new_();
                        }
                        if (extensions.pet == null) {
                            extensions.pet = PetInfo.new_();
                        }
                        if (extensions.tailFrame == null) {
                            extensions.tailFrame = TailFrame.new_();
                        }
                        if (extensions.voiceAvatarFrame == null) {
                            extensions.voiceAvatarFrame = VoiceAvatarFrame.new_();
                        }
                        if (extensions.marriage == null) {
                            extensions.marriage = ProfileExtensionMarriage.new_();
                        }
                        if (extensions.game == null) {
                            extensions.game = ExtensionGame.new_();
                        }
                        break;
                    case 10:
                        extensions.physical = (Physical) nb5Var.l(Physical.PROTOBUF_ADAPTER);
                        continue;
                    case 18:
                        extensions.business = (Business) nb5Var.l(Business.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        extensions.interest = (Interest) nb5Var.l(Interest.PROTOBUF_ADAPTER);
                        continue;
                    case 34:
                        extensions.basic = (ProfileExtensionBasic) nb5Var.l(ProfileExtensionBasic.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        extensions.anonymity = (Anonymity) nb5Var.l(Anonymity.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        extensions.headFrame = (HeadFrame) nb5Var.l(HeadFrame.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        extensions.friendStatus = (FriendStatus) nb5Var.l(FriendStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        extensions.momentSwitch = (MomentSwitch) nb5Var.l(MomentSwitch.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        extensions.wealth = (UserWealth) nb5Var.l(UserWealth.PROTOBUF_ADAPTER);
                        continue;
                    case 82:
                        extensions.profileCompletion = (ProfileCompletion) nb5Var.l(ProfileCompletion.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        extensions.voiceSignature = (VoiceSignature) nb5Var.l(VoiceSignature.PROTOBUF_ADAPTER);
                        continue;
                    case 98:
                        extensions.live = (VirtualVoiceLive) nb5Var.l(VirtualVoiceLive.PROTOBUF_ADAPTER);
                        continue;
                    case 106:
                        extensions.mate = (ProfileMate) nb5Var.l(ProfileMate.PROTOBUF_ADAPTER);
                        continue;
                    case 114:
                        extensions.pet = (PetInfo) nb5Var.l(PetInfo.PROTOBUF_ADAPTER);
                        continue;
                    case 122:
                        extensions.tailFrame = (TailFrame) nb5Var.l(TailFrame.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        extensions.voiceAvatarFrame = (VoiceAvatarFrame) nb5Var.l(VoiceAvatarFrame.PROTOBUF_ADAPTER);
                        continue;
                    case 138:
                        extensions.marriage = (ProfileExtensionMarriage) nb5Var.l(ProfileExtensionMarriage.PROTOBUF_ADAPTER);
                        continue;
                    case 146:
                        extensions.game = (ExtensionGame) nb5Var.l(ExtensionGame.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (extensions.physical == null) {
                            extensions.physical = Physical.new_();
                        }
                        if (extensions.business == null) {
                            extensions.business = Business.new_();
                        }
                        if (extensions.interest == null) {
                            extensions.interest = Interest.new_();
                        }
                        if (extensions.basic == null) {
                            extensions.basic = ProfileExtensionBasic.new_();
                        }
                        if (extensions.anonymity == null) {
                            extensions.anonymity = Anonymity.new_();
                        }
                        if (extensions.headFrame == null) {
                            extensions.headFrame = HeadFrame.new_();
                        }
                        if (extensions.friendStatus == null) {
                            extensions.friendStatus = FriendStatus.new_();
                        }
                        if (extensions.momentSwitch == null) {
                            extensions.momentSwitch = MomentSwitch.new_();
                        }
                        if (extensions.wealth == null) {
                            extensions.wealth = UserWealth.new_();
                        }
                        if (extensions.profileCompletion == null) {
                            extensions.profileCompletion = ProfileCompletion.new_();
                        }
                        if (extensions.voiceSignature == null) {
                            extensions.voiceSignature = VoiceSignature.new_();
                        }
                        if (extensions.live == null) {
                            extensions.live = VirtualVoiceLive.new_();
                        }
                        if (extensions.mate == null) {
                            extensions.mate = ProfileMate.new_();
                        }
                        if (extensions.pet == null) {
                            extensions.pet = PetInfo.new_();
                        }
                        if (extensions.tailFrame == null) {
                            extensions.tailFrame = TailFrame.new_();
                        }
                        if (extensions.voiceAvatarFrame == null) {
                            extensions.voiceAvatarFrame = VoiceAvatarFrame.new_();
                        }
                        if (extensions.marriage == null) {
                            extensions.marriage = ProfileExtensionMarriage.new_();
                        }
                        if (extensions.game == null) {
                            extensions.game = ExtensionGame.new_();
                            return extensions;
                        }
                        break;
                }
            }
            return extensions;
        }

        public void serialize(Extensions extensions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Physical physical = extensions.physical;
            if (physical != null) {
                codedOutputByteBufferNano.K(1, physical, Physical.PROTOBUF_ADAPTER);
            }
            Business business = extensions.business;
            if (business != null) {
                codedOutputByteBufferNano.K(2, business, Business.PROTOBUF_ADAPTER);
            }
            Interest interest = extensions.interest;
            if (interest != null) {
                codedOutputByteBufferNano.K(3, interest, Interest.PROTOBUF_ADAPTER);
            }
            ProfileExtensionBasic profileExtensionBasic = extensions.basic;
            if (profileExtensionBasic != null) {
                codedOutputByteBufferNano.K(4, profileExtensionBasic, ProfileExtensionBasic.PROTOBUF_ADAPTER);
            }
            Anonymity anonymity = extensions.anonymity;
            if (anonymity != null) {
                codedOutputByteBufferNano.K(5, anonymity, Anonymity.PROTOBUF_ADAPTER);
            }
            HeadFrame headFrame = extensions.headFrame;
            if (headFrame != null) {
                codedOutputByteBufferNano.K(6, headFrame, HeadFrame.PROTOBUF_ADAPTER);
            }
            FriendStatus friendStatus = extensions.friendStatus;
            if (friendStatus != null) {
                codedOutputByteBufferNano.K(7, friendStatus, FriendStatus.PROTOBUF_ADAPTER);
            }
            MomentSwitch momentSwitch = extensions.momentSwitch;
            if (momentSwitch != null) {
                codedOutputByteBufferNano.K(8, momentSwitch, MomentSwitch.PROTOBUF_ADAPTER);
            }
            UserWealth userWealth = extensions.wealth;
            if (userWealth != null) {
                codedOutputByteBufferNano.K(9, userWealth, UserWealth.PROTOBUF_ADAPTER);
            }
            ProfileCompletion profileCompletion = extensions.profileCompletion;
            if (profileCompletion != null) {
                codedOutputByteBufferNano.K(10, profileCompletion, ProfileCompletion.PROTOBUF_ADAPTER);
            }
            VoiceSignature voiceSignature = extensions.voiceSignature;
            if (voiceSignature != null) {
                codedOutputByteBufferNano.K(11, voiceSignature, VoiceSignature.PROTOBUF_ADAPTER);
            }
            VirtualVoiceLive virtualVoiceLive = extensions.live;
            if (virtualVoiceLive != null) {
                codedOutputByteBufferNano.K(12, virtualVoiceLive, VirtualVoiceLive.PROTOBUF_ADAPTER);
            }
            ProfileMate profileMate = extensions.mate;
            if (profileMate != null) {
                codedOutputByteBufferNano.K(13, profileMate, ProfileMate.PROTOBUF_ADAPTER);
            }
            PetInfo petInfo = extensions.pet;
            if (petInfo != null) {
                codedOutputByteBufferNano.K(14, petInfo, PetInfo.PROTOBUF_ADAPTER);
            }
            TailFrame tailFrame = extensions.tailFrame;
            if (tailFrame != null) {
                codedOutputByteBufferNano.K(15, tailFrame, TailFrame.PROTOBUF_ADAPTER);
            }
            VoiceAvatarFrame voiceAvatarFrame = extensions.voiceAvatarFrame;
            if (voiceAvatarFrame != null) {
                codedOutputByteBufferNano.K(16, voiceAvatarFrame, VoiceAvatarFrame.PROTOBUF_ADAPTER);
            }
            ProfileExtensionMarriage profileExtensionMarriage = extensions.marriage;
            if (profileExtensionMarriage != null) {
                codedOutputByteBufferNano.K(17, profileExtensionMarriage, ProfileExtensionMarriage.PROTOBUF_ADAPTER);
            }
            ExtensionGame extensionGame = extensions.game;
            if (extensionGame != null) {
                codedOutputByteBufferNano.K(18, extensionGame, ExtensionGame.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Extensions> JSON_ADAPTER = new ObjectJsonAdapter<Extensions>() { // from class: com.p1.mobile.putong.data.Extensions.2
        public Class getDataClass() {
            return Extensions.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Extensions mo17830newInstance() {
            return new Extensions();
        }

        public boolean parseField(Extensions extensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anonymity":
                    extensions.anonymity = (Anonymity) Anonymity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "momentSwitch":
                    extensions.momentSwitch = (MomentSwitch) MomentSwitch.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "business":
                    extensions.business = (Business) Business.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "physical":
                    extensions.physical = (Physical) Physical.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "wealth":
                    extensions.wealth = (UserWealth) UserWealth.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "profileCompletion":
                    extensions.profileCompletion = (ProfileCompletion) ProfileCompletion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "friendStatus":
                    extensions.friendStatus = (FriendStatus) FriendStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "headFrame":
                    extensions.headFrame = (HeadFrame) HeadFrame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tailFrame":
                    extensions.tailFrame = (TailFrame) TailFrame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pet":
                    extensions.pet = (PetInfo) PetInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "game":
                    extensions.game = (ExtensionGame) ExtensionGame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "live":
                    extensions.live = (VirtualVoiceLive) VirtualVoiceLive.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "mate":
                    extensions.mate = (ProfileMate) ProfileMate.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "basic":
                    extensions.basic = (ProfileExtensionBasic) ProfileExtensionBasic.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "marriage":
                    extensions.marriage = (ProfileExtensionMarriage) ProfileExtensionMarriage.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "interest":
                    extensions.interest = (Interest) Interest.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voiceAvatarFrame":
                    extensions.voiceAvatarFrame = (VoiceAvatarFrame) VoiceAvatarFrame.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "voiceSignature":
                    extensions.voiceSignature = (VoiceSignature) VoiceSignature.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Extensions extensions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "anonymity":
                case "momentSwitch":
                case "business":
                case "physical":
                case "wealth":
                case "profileCompletion":
                case "friendStatus":
                case "headFrame":
                case "tailFrame":
                case "pet":
                case "game":
                case "live":
                case "mate":
                case "basic":
                case "marriage":
                case "interest":
                case "voiceAvatarFrame":
                case "voiceSignature":
                    return true;
                default:
                    return super.parseFieldCheck(extensions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Extensions extensions, JsonGenerator jsonGenerator) throws IOException {
            if (extensions.physical != null) {
                jsonGenerator.writeFieldName(Physical.TYPE);
                Physical.JSON_ADAPTER.serialize(extensions.physical, jsonGenerator, true);
            }
            if (extensions.business != null) {
                jsonGenerator.writeFieldName("business");
                Business.JSON_ADAPTER.serialize(extensions.business, jsonGenerator, true);
            }
            if (extensions.interest != null) {
                jsonGenerator.writeFieldName(Interest.TYPE);
                Interest.JSON_ADAPTER.serialize(extensions.interest, jsonGenerator, true);
            }
            if (extensions.basic != null) {
                jsonGenerator.writeFieldName("basic");
                ProfileExtensionBasic.JSON_ADAPTER.serialize(extensions.basic, jsonGenerator, true);
            }
            if (extensions.anonymity != null) {
                jsonGenerator.writeFieldName(Anonymity.TYPE);
                Anonymity.JSON_ADAPTER.serialize(extensions.anonymity, jsonGenerator, true);
            }
            if (extensions.headFrame != null) {
                jsonGenerator.writeFieldName("headFrame");
                HeadFrame.JSON_ADAPTER.serialize(extensions.headFrame, jsonGenerator, true);
            }
            if (extensions.friendStatus != null) {
                jsonGenerator.writeFieldName("friendStatus");
                FriendStatus.JSON_ADAPTER.serialize(extensions.friendStatus, jsonGenerator, true);
            }
            if (extensions.momentSwitch != null) {
                jsonGenerator.writeFieldName("momentSwitch");
                MomentSwitch.JSON_ADAPTER.serialize(extensions.momentSwitch, jsonGenerator, true);
            }
            if (extensions.wealth != null) {
                jsonGenerator.writeFieldName("wealth");
                UserWealth.JSON_ADAPTER.serialize(extensions.wealth, jsonGenerator, true);
            }
            if (extensions.profileCompletion != null) {
                jsonGenerator.writeFieldName("profileCompletion");
                ProfileCompletion.JSON_ADAPTER.serialize(extensions.profileCompletion, jsonGenerator, true);
            }
            if (extensions.voiceSignature != null) {
                jsonGenerator.writeFieldName("voiceSignature");
                VoiceSignature.JSON_ADAPTER.serialize(extensions.voiceSignature, jsonGenerator, true);
            }
            if (extensions.live != null) {
                jsonGenerator.writeFieldName("live");
                VirtualVoiceLive.JSON_ADAPTER.serialize(extensions.live, jsonGenerator, true);
            }
            if (extensions.mate != null) {
                jsonGenerator.writeFieldName("mate");
                ProfileMate.JSON_ADAPTER.serialize(extensions.mate, jsonGenerator, true);
            }
            if (extensions.pet != null) {
                jsonGenerator.writeFieldName(Pet.TYPE);
                PetInfo.JSON_ADAPTER.serialize(extensions.pet, jsonGenerator, true);
            }
            if (extensions.tailFrame != null) {
                jsonGenerator.writeFieldName("tailFrame");
                TailFrame.JSON_ADAPTER.serialize(extensions.tailFrame, jsonGenerator, true);
            }
            if (extensions.voiceAvatarFrame != null) {
                jsonGenerator.writeFieldName("voiceAvatarFrame");
                VoiceAvatarFrame.JSON_ADAPTER.serialize(extensions.voiceAvatarFrame, jsonGenerator, true);
            }
            if (extensions.marriage != null) {
                jsonGenerator.writeFieldName(Purpose.marriage);
                ProfileExtensionMarriage.JSON_ADAPTER.serialize(extensions.marriage, jsonGenerator, true);
            }
            if (extensions.game != null) {
                jsonGenerator.writeFieldName("game");
                ExtensionGame.JSON_ADAPTER.serialize(extensions.game, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Extensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Extensions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Extensions new_() {
        Extensions extensions = new Extensions();
        extensions.nullCheck();
        return extensions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Extensions m18027clone() {
        Extensions extensions = new Extensions();
        Physical physical = this.physical;
        if (physical != null) {
            extensions.physical = physical.m18797clone();
        }
        Business business = this.business;
        if (business != null) {
            extensions.business = business.m17789clone();
        }
        Interest interest = this.interest;
        if (interest != null) {
            extensions.interest = interest.m18222clone();
        }
        ProfileExtensionBasic profileExtensionBasic = this.basic;
        if (profileExtensionBasic != null) {
            extensions.basic = profileExtensionBasic.m18840clone();
        }
        Anonymity anonymity = this.anonymity;
        if (anonymity != null) {
            extensions.anonymity = anonymity.m17697clone();
        }
        HeadFrame headFrame = this.headFrame;
        if (headFrame != null) {
            extensions.headFrame = headFrame.m18198clone();
        }
        FriendStatus friendStatus = this.friendStatus;
        if (friendStatus != null) {
            extensions.friendStatus = friendStatus.m18126clone();
        }
        MomentSwitch momentSwitch = this.momentSwitch;
        if (momentSwitch != null) {
            extensions.momentSwitch = momentSwitch.m18491clone();
        }
        UserWealth userWealth = this.wealth;
        if (userWealth != null) {
            extensions.wealth = userWealth.m19243clone();
        }
        ProfileCompletion profileCompletion = this.profileCompletion;
        if (profileCompletion != null) {
            extensions.profileCompletion = profileCompletion.m18837clone();
        }
        VoiceSignature voiceSignature = this.voiceSignature;
        if (voiceSignature != null) {
            extensions.voiceSignature = voiceSignature.m19364clone();
        }
        VirtualVoiceLive virtualVoiceLive = this.live;
        if (virtualVoiceLive != null) {
            extensions.live = virtualVoiceLive.m19322clone();
        }
        ProfileMate profileMate = this.mate;
        if (profileMate != null) {
            extensions.mate = profileMate.m18849clone();
        }
        PetInfo petInfo = this.pet;
        if (petInfo != null) {
            extensions.pet = petInfo.m18791clone();
        }
        TailFrame tailFrame = this.tailFrame;
        if (tailFrame != null) {
            extensions.tailFrame = tailFrame.m19081clone();
        }
        VoiceAvatarFrame voiceAvatarFrame = this.voiceAvatarFrame;
        if (voiceAvatarFrame != null) {
            extensions.voiceAvatarFrame = voiceAvatarFrame.m19340clone();
        }
        ProfileExtensionMarriage profileExtensionMarriage = this.marriage;
        if (profileExtensionMarriage != null) {
            extensions.marriage = profileExtensionMarriage.m18843clone();
        }
        ExtensionGame extensionGame = this.game;
        if (extensionGame != null) {
            extensions.game = extensionGame.m18024clone();
        }
        return extensions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Extensions)) {
            return false;
        }
        Extensions extensions = (Extensions) obj;
        return ValueObject.util_equals(this.physical, extensions.physical) && ValueObject.util_equals(this.business, extensions.business) && ValueObject.util_equals(this.interest, extensions.interest) && ValueObject.util_equals(this.basic, extensions.basic) && ValueObject.util_equals(this.anonymity, extensions.anonymity) && ValueObject.util_equals(this.headFrame, extensions.headFrame) && ValueObject.util_equals(this.friendStatus, extensions.friendStatus) && ValueObject.util_equals(this.momentSwitch, extensions.momentSwitch) && ValueObject.util_equals(this.wealth, extensions.wealth) && ValueObject.util_equals(this.profileCompletion, extensions.profileCompletion) && ValueObject.util_equals(this.voiceSignature, extensions.voiceSignature) && ValueObject.util_equals(this.live, extensions.live) && ValueObject.util_equals(this.mate, extensions.mate) && ValueObject.util_equals(this.pet, extensions.pet) && ValueObject.util_equals(this.tailFrame, extensions.tailFrame) && ValueObject.util_equals(this.voiceAvatarFrame, extensions.voiceAvatarFrame) && ValueObject.util_equals(this.marriage, extensions.marriage) && ValueObject.util_equals(this.game, extensions.game);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Physical physical = this.physical;
        int iHashCode = (i2 + (physical != null ? physical.hashCode() : 0)) * 41;
        Business business = this.business;
        int iHashCode2 = (iHashCode + (business != null ? business.hashCode() : 0)) * 41;
        Interest interest = this.interest;
        int iHashCode3 = (iHashCode2 + (interest != null ? interest.hashCode() : 0)) * 41;
        ProfileExtensionBasic profileExtensionBasic = this.basic;
        int iHashCode4 = (iHashCode3 + (profileExtensionBasic != null ? profileExtensionBasic.hashCode() : 0)) * 41;
        Anonymity anonymity = this.anonymity;
        int iHashCode5 = (iHashCode4 + (anonymity != null ? anonymity.hashCode() : 0)) * 41;
        HeadFrame headFrame = this.headFrame;
        int iHashCode6 = (iHashCode5 + (headFrame != null ? headFrame.hashCode() : 0)) * 41;
        FriendStatus friendStatus = this.friendStatus;
        int iHashCode7 = (iHashCode6 + (friendStatus != null ? friendStatus.hashCode() : 0)) * 41;
        MomentSwitch momentSwitch = this.momentSwitch;
        int iHashCode8 = (iHashCode7 + (momentSwitch != null ? momentSwitch.hashCode() : 0)) * 41;
        UserWealth userWealth = this.wealth;
        int iHashCode9 = (iHashCode8 + (userWealth != null ? userWealth.hashCode() : 0)) * 41;
        ProfileCompletion profileCompletion = this.profileCompletion;
        int iHashCode10 = (iHashCode9 + (profileCompletion != null ? profileCompletion.hashCode() : 0)) * 41;
        VoiceSignature voiceSignature = this.voiceSignature;
        int iHashCode11 = (iHashCode10 + (voiceSignature != null ? voiceSignature.hashCode() : 0)) * 41;
        VirtualVoiceLive virtualVoiceLive = this.live;
        int iHashCode12 = (iHashCode11 + (virtualVoiceLive != null ? virtualVoiceLive.hashCode() : 0)) * 41;
        ProfileMate profileMate = this.mate;
        int iHashCode13 = (iHashCode12 + (profileMate != null ? profileMate.hashCode() : 0)) * 41;
        PetInfo petInfo = this.pet;
        int iHashCode14 = (iHashCode13 + (petInfo != null ? petInfo.hashCode() : 0)) * 41;
        TailFrame tailFrame = this.tailFrame;
        int iHashCode15 = (iHashCode14 + (tailFrame != null ? tailFrame.hashCode() : 0)) * 41;
        VoiceAvatarFrame voiceAvatarFrame = this.voiceAvatarFrame;
        int iHashCode16 = (iHashCode15 + (voiceAvatarFrame != null ? voiceAvatarFrame.hashCode() : 0)) * 41;
        ProfileExtensionMarriage profileExtensionMarriage = this.marriage;
        int iHashCode17 = (iHashCode16 + (profileExtensionMarriage != null ? profileExtensionMarriage.hashCode() : 0)) * 41;
        ExtensionGame extensionGame = this.game;
        int iHashCode18 = iHashCode17 + (extensionGame != null ? extensionGame.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode18;
        return iHashCode18;
    }

    public void nullCheck() {
        if (this.physical == null) {
            this.physical = Physical.new_();
        }
        if (this.business == null) {
            this.business = Business.new_();
        }
        if (this.interest == null) {
            this.interest = Interest.new_();
        }
        if (this.basic == null) {
            this.basic = ProfileExtensionBasic.new_();
        }
        if (this.anonymity == null) {
            this.anonymity = Anonymity.new_();
        }
        if (this.headFrame == null) {
            this.headFrame = HeadFrame.new_();
        }
        if (this.friendStatus == null) {
            this.friendStatus = FriendStatus.new_();
        }
        if (this.momentSwitch == null) {
            this.momentSwitch = MomentSwitch.new_();
        }
        if (this.wealth == null) {
            this.wealth = UserWealth.new_();
        }
        if (this.profileCompletion == null) {
            this.profileCompletion = ProfileCompletion.new_();
        }
        if (this.voiceSignature == null) {
            this.voiceSignature = VoiceSignature.new_();
        }
        if (this.live == null) {
            this.live = VirtualVoiceLive.new_();
        }
        if (this.mate == null) {
            this.mate = ProfileMate.new_();
        }
        if (this.pet == null) {
            this.pet = PetInfo.new_();
        }
        if (this.tailFrame == null) {
            this.tailFrame = TailFrame.new_();
        }
        if (this.voiceAvatarFrame == null) {
            this.voiceAvatarFrame = VoiceAvatarFrame.new_();
        }
        if (this.marriage == null) {
            this.marriage = ProfileExtensionMarriage.new_();
        }
        if (this.game == null) {
            this.game = ExtensionGame.new_();
        }
    }

    public Extensions subtract(Extensions extensions) {
        Extensions extensions2 = new Extensions();
        if (!ValueObject.util_equals(this.physical, extensions.physical)) {
            extensions2.physical = this.physical;
        }
        if (!ValueObject.util_equals(this.business, extensions.business)) {
            extensions2.business = this.business;
        }
        Interest interest = this.interest;
        if (interest != null) {
            extensions2.interest = interest.subtract(extensions.interest);
        }
        ProfileExtensionBasic profileExtensionBasic = this.basic;
        if (profileExtensionBasic != null) {
            extensions2.basic = profileExtensionBasic.subtract(extensions.basic);
        }
        Anonymity anonymity = this.anonymity;
        if (anonymity != null) {
            extensions2.anonymity = anonymity.subtract(extensions.anonymity);
        }
        HeadFrame headFrame = this.headFrame;
        if (headFrame != null) {
            extensions2.headFrame = headFrame.subtract(extensions.headFrame);
        }
        if (!ValueObject.util_equals(this.friendStatus, extensions.friendStatus)) {
            extensions2.friendStatus = this.friendStatus;
        }
        if (!ValueObject.util_equals(this.momentSwitch, extensions.momentSwitch)) {
            extensions2.momentSwitch = this.momentSwitch;
        }
        UserWealth userWealth = this.wealth;
        if (userWealth != null) {
            extensions2.wealth = userWealth.subtract(extensions.wealth);
        }
        if (!ValueObject.util_equals(this.profileCompletion, extensions.profileCompletion)) {
            extensions2.profileCompletion = this.profileCompletion;
        }
        if (!ValueObject.util_equals(this.voiceSignature, extensions.voiceSignature)) {
            extensions2.voiceSignature = this.voiceSignature;
        }
        if (!ValueObject.util_equals(this.live, extensions.live)) {
            extensions2.live = this.live;
        }
        if (!ValueObject.util_equals(this.mate, extensions.mate)) {
            extensions2.mate = this.mate;
        }
        if (!ValueObject.util_equals(this.pet, extensions.pet)) {
            extensions2.pet = this.pet;
        }
        TailFrame tailFrame = this.tailFrame;
        if (tailFrame != null) {
            extensions2.tailFrame = tailFrame.subtract(extensions.tailFrame);
        }
        if (!ValueObject.util_equals(this.voiceAvatarFrame, extensions.voiceAvatarFrame)) {
            extensions2.voiceAvatarFrame = this.voiceAvatarFrame;
        }
        ProfileExtensionMarriage profileExtensionMarriage = this.marriage;
        if (profileExtensionMarriage != null) {
            extensions2.marriage = profileExtensionMarriage.subtract(extensions.marriage);
        }
        ExtensionGame extensionGame = this.game;
        if (extensionGame != null) {
            extensions2.game = extensionGame.subtract(extensions.game);
        }
        if (extensions2.equals(new Extensions())) {
            return null;
        }
        return extensions2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
