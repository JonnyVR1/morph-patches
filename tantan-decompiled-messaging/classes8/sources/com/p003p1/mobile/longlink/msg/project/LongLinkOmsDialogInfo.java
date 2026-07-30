package com.p003p1.mobile.longlink.msg.project;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.a;
import com.google.protobuf.e;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.p;
import com.google.protobuf.q;
import com.p003p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l.aag0;
import l.bz00;
import l.i860;
import l.o6z;
import l.x9g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class LongLinkOmsDialogInfo {

    /* JADX INFO: renamed from: com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo$1 */
    public static /* synthetic */ class C04581 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f1695xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f1695xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1695xa1df5c61[GeneratedMessageLite.MethodToInvoke.IS_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1695xa1df5c61[GeneratedMessageLite.MethodToInvoke.MAKE_IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1695xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1695xa1df5c61[GeneratedMessageLite.MethodToInvoke.VISIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1695xa1df5c61[GeneratedMessageLite.MethodToInvoke.MERGE_FROM_STREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1695xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1695xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface ConstraintOrBuilder extends o6z {
        int getCount();

        /* synthetic */ q getDefaultInstanceForType();

        int getFrequency(int i);

        int getFrequencyCount();

        List<Integer> getFrequencyList();

        int getPriority();

        int getSessionCount();

        int getTimePerDay();

        long getTimeRange(int i);

        int getTimeRangeCount();

        List<Long> getTimeRangeList();

        /* synthetic */ boolean isInitialized();
    }

    public interface ContentOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        ByteString getMorph();

        Resource getTemplate();

        Web getWeb();

        boolean hasTemplate();

        boolean hasWeb();

        /* synthetic */ boolean isInitialized();
    }

    public interface DialogOrBuilder extends o6z {
        boolean getBlockCard();

        boolean getCancelAble();

        Constraint getConstraint();

        Content getContent();

        String getContentType();

        ByteString getContentTypeBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        String getIdentifier();

        ByteString getIdentifierBytes();

        Mercury getMercury();

        Position getPosition();

        boolean getRemote();

        int getVersion();

        boolean hasConstraint();

        boolean hasContent();

        boolean hasMercury();

        boolean hasPosition();

        /* synthetic */ boolean isInitialized();
    }

    public interface DialogsOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        Dialog getDialogs(int i);

        int getDialogsCount();

        List<Dialog> getDialogsList();

        /* synthetic */ boolean isInitialized();
    }

    public interface LayoutOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getType();

        ByteString getTypeBytes();

        double getValue();

        /* synthetic */ boolean isInitialized();
    }

    public interface MercuryOrBuilder extends o6z {
        boolean containsServer(String str);

        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        @Deprecated
        Map<String, String> getServer();

        int getServerCount();

        Map<String, String> getServerMap();

        String getServerOrDefault(String str, String str2);

        String getServerOrThrow(String str);

        String getType();

        ByteString getTypeBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface NodeContentOrBuilder extends o6z {
        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        String getColor();

        ByteString getColorBytes();

        /* synthetic */ q getDefaultInstanceForType();

        String getFont();

        ByteString getFontBytes();

        int getSize();

        boolean getStrikethrough();

        boolean getUnderline();

        String getUrl();

        ByteString getUrlBytes();

        String getValue();

        ByteString getValueBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface PositionOrBuilder extends o6z {
        String getContain(int i);

        ByteString getContainBytes(int i);

        int getContainCount();

        List<String> getContainList();

        /* synthetic */ q getDefaultInstanceForType();

        String getExclude(int i);

        ByteString getExcludeBytes(int i);

        int getExcludeCount();

        List<String> getExcludeList();

        String getId();

        ByteString getIdBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface ResourceNodeOrBuilder extends o6z {
        String getColors(int i);

        ByteString getColorsBytes(int i);

        int getColorsCount();

        List<String> getColorsList();

        NodeContent getContents(int i);

        int getContentsCount();

        List<NodeContent> getContentsList();

        /* synthetic */ q getDefaultInstanceForType();

        String getDirection();

        ByteString getDirectionBytes();

        String getIndex();

        ByteString getIndexBytes();

        Mercury getMercury();

        String getSrc();

        ByteString getSrcBytes();

        String getType();

        ByteString getTypeBytes();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasMercury();

        /* synthetic */ boolean isInitialized();
    }

    public interface ResourceOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        String getId();

        ByteString getIdBytes();

        ResourcePage getPages(int i);

        int getPagesCount();

        List<ResourcePage> getPagesList();

        String getTemplateID();

        ByteString getTemplateIDBytes();

        /* synthetic */ boolean isInitialized();
    }

    public interface ResourcePageOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        int getIndex();

        ResourceNode getNodes(int i);

        int getNodesCount();

        List<ResourceNode> getNodesList();

        /* synthetic */ boolean isInitialized();
    }

    public interface WebOrBuilder extends o6z {
        /* synthetic */ q getDefaultInstanceForType();

        Layout getHeight();

        String getUrl();

        ByteString getUrlBytes();

        Layout getWidth();

        boolean hasHeight();

        boolean hasWidth();

        /* synthetic */ boolean isInitialized();
    }

    private LongLinkOmsDialogInfo() {
    }

    public static void registerAllExtensions(h hVar) {
    }

    public static final class Constraint extends GeneratedMessageLite<Constraint, Builder> implements ConstraintOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final Constraint DEFAULT_INSTANCE;
        public static final int FREQUENCY_FIELD_NUMBER = 3;
        private static volatile i860<Constraint> PARSER = null;
        public static final int PRIORITY_FIELD_NUMBER = 6;
        public static final int SESSIONCOUNT_FIELD_NUMBER = 2;
        public static final int TIMEPERDAY_FIELD_NUMBER = 5;
        public static final int TIMERANGE_FIELD_NUMBER = 4;
        private int bitField0_;
        private int count_;
        private int priority_;
        private int sessionCount_;
        private int timePerDay_;
        private l.f frequency_ = GeneratedMessageLite.emptyIntList();
        private l.g timeRange_ = GeneratedMessageLite.emptyLongList();

        public static final class Builder extends GeneratedMessageLite.b<Constraint, Builder> implements ConstraintOrBuilder {
            private Builder() {
                super(Constraint.DEFAULT_INSTANCE);
            }

            public Builder addAllFrequency(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).addAllFrequency(iterable);
                return this;
            }

            public Builder addAllTimeRange(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).addAllTimeRange(iterable);
                return this;
            }

            public Builder addFrequency(int i) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).addFrequency(i);
                return this;
            }

            public Builder addTimeRange(long j) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).addTimeRange(j);
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).clearCount();
                return this;
            }

            public Builder clearFrequency() {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).clearFrequency();
                return this;
            }

            public Builder clearPriority() {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).clearPriority();
                return this;
            }

            public Builder clearSessionCount() {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).clearSessionCount();
                return this;
            }

            public Builder clearTimePerDay() {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).clearTimePerDay();
                return this;
            }

            public Builder clearTimeRange() {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).clearTimeRange();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getCount() {
                return ((Constraint) ((GeneratedMessageLite.b) this).instance).getCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getFrequency(int i) {
                return ((Constraint) ((GeneratedMessageLite.b) this).instance).getFrequency(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getFrequencyCount() {
                return ((Constraint) ((GeneratedMessageLite.b) this).instance).getFrequencyCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public List<Integer> getFrequencyList() {
                return Collections.unmodifiableList(((Constraint) ((GeneratedMessageLite.b) this).instance).getFrequencyList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getPriority() {
                return ((Constraint) ((GeneratedMessageLite.b) this).instance).getPriority();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getSessionCount() {
                return ((Constraint) ((GeneratedMessageLite.b) this).instance).getSessionCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getTimePerDay() {
                return ((Constraint) ((GeneratedMessageLite.b) this).instance).getTimePerDay();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public long getTimeRange(int i) {
                return ((Constraint) ((GeneratedMessageLite.b) this).instance).getTimeRange(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public int getTimeRangeCount() {
                return ((Constraint) ((GeneratedMessageLite.b) this).instance).getTimeRangeCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
            public List<Long> getTimeRangeList() {
                return Collections.unmodifiableList(((Constraint) ((GeneratedMessageLite.b) this).instance).getTimeRangeList());
            }

            public Builder setCount(int i) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).setCount(i);
                return this;
            }

            public Builder setFrequency(int i, int i2) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).setFrequency(i, i2);
                return this;
            }

            public Builder setPriority(int i) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).setPriority(i);
                return this;
            }

            public Builder setSessionCount(int i) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).setSessionCount(i);
                return this;
            }

            public Builder setTimePerDay(int i) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).setTimePerDay(i);
                return this;
            }

            public Builder setTimeRange(int i, long j) {
                copyOnWrite();
                ((Constraint) ((GeneratedMessageLite.b) this).instance).setTimeRange(i, j);
                return this;
            }
        }

        static {
            Constraint constraint = new Constraint();
            DEFAULT_INSTANCE = constraint;
            constraint.makeImmutable();
        }

        private Constraint() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFrequency(Iterable<? extends Integer> iterable) {
            ensureFrequencyIsMutable();
            a.addAll(iterable, this.frequency_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTimeRange(Iterable<? extends Long> iterable) {
            ensureTimeRangeIsMutable();
            a.addAll(iterable, this.timeRange_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFrequency(int i) {
            ensureFrequencyIsMutable();
            this.frequency_.T(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTimeRange(long j) {
            ensureTimeRangeIsMutable();
            this.timeRange_.u(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.count_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFrequency() {
            this.frequency_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPriority() {
            this.priority_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSessionCount() {
            this.sessionCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimePerDay() {
            this.timePerDay_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeRange() {
            this.timeRange_ = GeneratedMessageLite.emptyLongList();
        }

        private void ensureFrequencyIsMutable() {
            if (this.frequency_.q()) {
                return;
            }
            this.frequency_ = GeneratedMessageLite.mutableCopy(this.frequency_);
        }

        private void ensureTimeRangeIsMutable() {
            if (this.timeRange_.q()) {
                return;
            }
            this.timeRange_ = GeneratedMessageLite.mutableCopy(this.timeRange_);
        }

        public static Constraint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Constraint constraint) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(constraint);
        }

        public static Constraint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Constraint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Constraint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Constraint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int i) {
            this.count_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFrequency(int i, int i2) {
            ensureFrequencyIsMutable();
            this.frequency_.setInt(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPriority(int i) {
            this.priority_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSessionCount(int i) {
            this.sessionCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimePerDay(int i) {
            this.timePerDay_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeRange(int i, long j) {
            ensureTimeRangeIsMutable();
            this.timeRange_.setLong(i, j);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Constraint();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.frequency_.n();
                    this.timeRange_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    Constraint constraint = (Constraint) obj2;
                    int i = this.count_;
                    boolean z2 = i != 0;
                    int i2 = constraint.count_;
                    this.count_ = gVar.e(z2, i, i2 != 0, i2);
                    int i3 = this.sessionCount_;
                    boolean z3 = i3 != 0;
                    int i4 = constraint.sessionCount_;
                    this.sessionCount_ = gVar.e(z3, i3, i4 != 0, i4);
                    this.frequency_ = gVar.n(this.frequency_, constraint.frequency_);
                    this.timeRange_ = gVar.q(this.timeRange_, constraint.timeRange_);
                    int i5 = this.timePerDay_;
                    boolean z4 = i5 != 0;
                    int i6 = constraint.timePerDay_;
                    this.timePerDay_ = gVar.e(z4, i5, i6 != 0, i6);
                    int i7 = this.priority_;
                    boolean z5 = i7 != 0;
                    int i8 = constraint.priority_;
                    this.priority_ = gVar.e(z5, i7, i8 != 0, i8);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= constraint.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.count_ = eVar.u();
                                } else if (iM == 16) {
                                    this.sessionCount_ = eVar.u();
                                } else if (iM == 24) {
                                    if (!this.frequency_.q()) {
                                        this.frequency_ = GeneratedMessageLite.mutableCopy(this.frequency_);
                                    }
                                    this.frequency_.T(eVar.u());
                                } else if (iM == 26) {
                                    int iL = eVar.l(eVar.C());
                                    if (!this.frequency_.q() && eVar.d() > 0) {
                                        this.frequency_ = GeneratedMessageLite.mutableCopy(this.frequency_);
                                    }
                                    while (eVar.d() > 0) {
                                        this.frequency_.T(eVar.u());
                                    }
                                    eVar.k(iL);
                                } else if (iM == 32) {
                                    if (!this.timeRange_.q()) {
                                        this.timeRange_ = GeneratedMessageLite.mutableCopy(this.timeRange_);
                                    }
                                    this.timeRange_.u(eVar.v());
                                } else if (iM == 34) {
                                    int iL2 = eVar.l(eVar.C());
                                    if (!this.timeRange_.q() && eVar.d() > 0) {
                                        this.timeRange_ = GeneratedMessageLite.mutableCopy(this.timeRange_);
                                    }
                                    while (eVar.d() > 0) {
                                        this.timeRange_.u(eVar.v());
                                    }
                                    eVar.k(iL2);
                                } else if (iM == 40) {
                                    this.timePerDay_ = eVar.u();
                                } else if (iM == 48) {
                                    this.priority_ = eVar.u();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Constraint.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getFrequency(int i) {
            return this.frequency_.getInt(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getFrequencyCount() {
            return this.frequency_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public List<Integer> getFrequencyList() {
            return this.frequency_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.count_;
            int iT = i2 != 0 ? CodedOutputStream.t(1, i2) : 0;
            int i3 = this.sessionCount_;
            if (i3 != 0) {
                iT += CodedOutputStream.t(2, i3);
            }
            int iU = 0;
            for (int i4 = 0; i4 < this.frequency_.size(); i4++) {
                iU += CodedOutputStream.u(this.frequency_.getInt(i4));
            }
            int size = iT + iU + getFrequencyList().size();
            int iW = 0;
            for (int i5 = 0; i5 < this.timeRange_.size(); i5++) {
                iW += CodedOutputStream.w(this.timeRange_.getLong(i5));
            }
            int size2 = size + iW + getTimeRangeList().size();
            int i6 = this.timePerDay_;
            if (i6 != 0) {
                size2 += CodedOutputStream.t(5, i6);
            }
            int i7 = this.priority_;
            if (i7 != 0) {
                size2 += CodedOutputStream.t(6, i7);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = size2;
            return size2;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getSessionCount() {
            return this.sessionCount_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getTimePerDay() {
            return this.timePerDay_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public long getTimeRange(int i) {
            return this.timeRange_.getLong(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public int getTimeRangeCount() {
            return this.timeRange_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ConstraintOrBuilder
        public List<Long> getTimeRangeList() {
            return this.timeRange_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            int i = this.count_;
            if (i != 0) {
                codedOutputStream.s0(1, i);
            }
            int i2 = this.sessionCount_;
            if (i2 != 0) {
                codedOutputStream.s0(2, i2);
            }
            for (int i3 = 0; i3 < this.frequency_.size(); i3++) {
                codedOutputStream.s0(3, this.frequency_.getInt(i3));
            }
            for (int i4 = 0; i4 < this.timeRange_.size(); i4++) {
                codedOutputStream.u0(4, this.timeRange_.getLong(i4));
            }
            int i5 = this.timePerDay_;
            if (i5 != 0) {
                codedOutputStream.s0(5, i5);
            }
            int i6 = this.priority_;
            if (i6 != 0) {
                codedOutputStream.s0(6, i6);
            }
        }

        public static Constraint parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Constraint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Constraint parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Constraint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Constraint parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Constraint parseFrom(InputStream inputStream) throws IOException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Constraint parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Constraint parseFrom(e eVar) throws IOException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Constraint parseFrom(e eVar, h hVar) throws IOException {
            return (Constraint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Content extends GeneratedMessageLite<Content, Builder> implements ContentOrBuilder {
        private static final Content DEFAULT_INSTANCE;
        public static final int MORPH_FIELD_NUMBER = 3;
        private static volatile i860<Content> PARSER = null;
        public static final int TEMPLATE_FIELD_NUMBER = 1;
        public static final int WEB_FIELD_NUMBER = 2;
        private ByteString morph_ = ByteString.EMPTY;
        private Resource template_;
        private Web web_;

        static {
            Content content = new Content();
            DEFAULT_INSTANCE = content;
            content.makeImmutable();
        }

        private Content() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMorph() {
            this.morph_ = getDefaultInstance().getMorph();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplate() {
            this.template_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeb() {
            this.web_ = null;
        }

        public static Content getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTemplate(Resource resource) {
            Resource resource2 = this.template_;
            if (resource2 == null || resource2 == Resource.getDefaultInstance()) {
                this.template_ = resource;
            } else {
                this.template_ = (Resource) ((Resource.Builder) Resource.newBuilder(this.template_).mergeFrom(resource)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWeb(Web web) {
            Web web2 = this.web_;
            if (web2 == null || web2 == Web.getDefaultInstance()) {
                this.web_ = web;
            } else {
                this.web_ = (Web) ((Web.Builder) Web.newBuilder(this.web_).mergeFrom(web)).buildPartial();
            }
        }

        public static Builder newBuilder(Content content) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(content);
        }

        public static Content parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Content parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Content> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMorph(ByteString byteString) {
            byteString.getClass();
            this.morph_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Resource.Builder builder) {
            this.template_ = (Resource) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeb(Web.Builder builder) {
            this.web_ = (Web) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Content();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Content content = (Content) obj2;
                    this.template_ = hVar.o(this.template_, content.template_);
                    this.web_ = hVar.o(this.web_, content.web_);
                    ByteString byteString = this.morph_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean z2 = byteString != byteString2;
                    ByteString byteString3 = content.morph_;
                    this.morph_ = hVar.h(z2, byteString, byteString3 != byteString2, byteString3);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    Resource resource = this.template_;
                                    Resource.Builder builder = resource != null ? (Resource.Builder) resource.toBuilder() : null;
                                    Resource resourceW = eVar.w(Resource.parser(), hVar2);
                                    this.template_ = resourceW;
                                    if (builder != null) {
                                        builder.mergeFrom(resourceW);
                                        this.template_ = (Resource) builder.buildPartial();
                                    }
                                } else if (iM == 18) {
                                    Web web = this.web_;
                                    Web.Builder builder2 = web != null ? (Web.Builder) web.toBuilder() : null;
                                    Web webW = eVar.w(Web.parser(), hVar2);
                                    this.web_ = webW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(webW);
                                        this.web_ = (Web) builder2.buildPartial();
                                    }
                                } else if (iM == 26) {
                                    this.morph_ = eVar.n();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Content.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public ByteString getMorph() {
            return this.morph_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = this.template_ != null ? CodedOutputStream.C(1, getTemplate()) : 0;
            if (this.web_ != null) {
                iC += CodedOutputStream.C(2, getWeb());
            }
            if (!this.morph_.isEmpty()) {
                iC += CodedOutputStream.i(3, this.morph_);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public Resource getTemplate() {
            Resource resource = this.template_;
            return resource == null ? Resource.getDefaultInstance() : resource;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public Web getWeb() {
            Web web = this.web_;
            return web == null ? Web.getDefaultInstance() : web;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public boolean hasTemplate() {
            return this.template_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
        public boolean hasWeb() {
            return this.web_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.template_ != null) {
                codedOutputStream.w0(1, getTemplate());
            }
            if (this.web_ != null) {
                codedOutputStream.w0(2, getWeb());
            }
            if (this.morph_.isEmpty()) {
                return;
            }
            codedOutputStream.e0(3, this.morph_);
        }

        public static Content parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Content parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplate(Resource resource) {
            resource.getClass();
            this.template_ = resource;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeb(Web web) {
            web.getClass();
            this.web_ = web;
        }

        public static final class Builder extends GeneratedMessageLite.b<Content, Builder> implements ContentOrBuilder {
            private Builder() {
                super(Content.DEFAULT_INSTANCE);
            }

            public Builder clearMorph() {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).clearMorph();
                return this;
            }

            public Builder clearTemplate() {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).clearTemplate();
                return this;
            }

            public Builder clearWeb() {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).clearWeb();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public ByteString getMorph() {
                return ((Content) ((GeneratedMessageLite.b) this).instance).getMorph();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public Resource getTemplate() {
                return ((Content) ((GeneratedMessageLite.b) this).instance).getTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public Web getWeb() {
                return ((Content) ((GeneratedMessageLite.b) this).instance).getWeb();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public boolean hasTemplate() {
                return ((Content) ((GeneratedMessageLite.b) this).instance).hasTemplate();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ContentOrBuilder
            public boolean hasWeb() {
                return ((Content) ((GeneratedMessageLite.b) this).instance).hasWeb();
            }

            public Builder mergeTemplate(Resource resource) {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).mergeTemplate(resource);
                return this;
            }

            public Builder mergeWeb(Web web) {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).mergeWeb(web);
                return this;
            }

            public Builder setMorph(ByteString byteString) {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).setMorph(byteString);
                return this;
            }

            public Builder setTemplate(Resource resource) {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).setTemplate(resource);
                return this;
            }

            public Builder setWeb(Web web) {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).setWeb(web);
                return this;
            }

            public Builder setTemplate(Resource.Builder builder) {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).setTemplate(builder);
                return this;
            }

            public Builder setWeb(Web.Builder builder) {
                copyOnWrite();
                ((Content) ((GeneratedMessageLite.b) this).instance).setWeb(builder);
                return this;
            }
        }

        public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Content parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Content parseFrom(InputStream inputStream) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Content parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Content parseFrom(e eVar) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Content parseFrom(e eVar, h hVar) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Dialog extends GeneratedMessageLite<Dialog, Builder> implements DialogOrBuilder {
        public static final int BLOCKCARD_FIELD_NUMBER = 6;
        public static final int CANCELABLE_FIELD_NUMBER = 5;
        public static final int CONSTRAINT_FIELD_NUMBER = 7;
        public static final int CONTENTTYPE_FIELD_NUMBER = 10;
        public static final int CONTENT_FIELD_NUMBER = 11;
        private static final Dialog DEFAULT_INSTANCE;
        public static final int IDENTIFIER_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MERCURY_FIELD_NUMBER = 9;
        private static volatile i860<Dialog> PARSER = null;
        public static final int POSITION_FIELD_NUMBER = 8;
        public static final int REMOTE_FIELD_NUMBER = 4;
        public static final int VERSION_FIELD_NUMBER = 3;
        private boolean blockCard_;
        private boolean cancelAble_;
        private Constraint constraint_;
        private Content content_;
        private Mercury mercury_;
        private Position position_;
        private boolean remote_;
        private int version_;
        private String id_ = "";
        private String identifier_ = "";
        private String contentType_ = "";

        static {
            Dialog dialog = new Dialog();
            DEFAULT_INSTANCE = dialog;
            dialog.makeImmutable();
        }

        private Dialog() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlockCard() {
            this.blockCard_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCancelAble() {
            this.cancelAble_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConstraint() {
            this.constraint_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContentType() {
            this.contentType_ = getDefaultInstance().getContentType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdentifier() {
            this.identifier_ = getDefaultInstance().getIdentifier();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMercury() {
            this.mercury_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPosition() {
            this.position_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemote() {
            this.remote_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.version_ = 0;
        }

        public static Dialog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeConstraint(Constraint constraint) {
            Constraint constraint2 = this.constraint_;
            if (constraint2 == null || constraint2 == Constraint.getDefaultInstance()) {
                this.constraint_ = constraint;
            } else {
                this.constraint_ = (Constraint) ((Constraint.Builder) Constraint.newBuilder(this.constraint_).mergeFrom(constraint)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeContent(Content content) {
            Content content2 = this.content_;
            if (content2 == null || content2 == Content.getDefaultInstance()) {
                this.content_ = content;
            } else {
                this.content_ = (Content) ((Content.Builder) Content.newBuilder(this.content_).mergeFrom(content)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMercury(Mercury mercury) {
            Mercury mercury2 = this.mercury_;
            if (mercury2 == null || mercury2 == Mercury.getDefaultInstance()) {
                this.mercury_ = mercury;
            } else {
                this.mercury_ = (Mercury) ((Mercury.Builder) Mercury.newBuilder(this.mercury_).mergeFrom(mercury)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePosition(Position position) {
            Position position2 = this.position_;
            if (position2 == null || position2 == Position.getDefaultInstance()) {
                this.position_ = position;
            } else {
                this.position_ = (Position) ((Position.Builder) Position.newBuilder(this.position_).mergeFrom(position)).buildPartial();
            }
        }

        public static Builder newBuilder(Dialog dialog) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(dialog);
        }

        public static Dialog parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialog parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Dialog> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlockCard(boolean z) {
            this.blockCard_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCancelAble(boolean z) {
            this.cancelAble_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConstraint(Constraint.Builder builder) {
            this.constraint_ = (Constraint) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(Content.Builder builder) {
            this.content_ = (Content) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentType(String str) {
            str.getClass();
            this.contentType_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.contentType_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifier(String str) {
            str.getClass();
            this.identifier_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdentifierBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.identifier_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMercury(Mercury.Builder builder) {
            this.mercury_ = (Mercury) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(Position.Builder builder) {
            this.position_ = (Position) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemote(boolean z) {
            this.remote_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.version_ = i;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Dialog();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Dialog dialog = (Dialog) obj2;
                    this.id_ = hVar.f(!this.id_.isEmpty(), this.id_, !dialog.id_.isEmpty(), dialog.id_);
                    this.identifier_ = hVar.f(!this.identifier_.isEmpty(), this.identifier_, !dialog.identifier_.isEmpty(), dialog.identifier_);
                    int i = this.version_;
                    boolean z2 = i != 0;
                    int i2 = dialog.version_;
                    this.version_ = hVar.e(z2, i, i2 != 0, i2);
                    boolean z3 = this.remote_;
                    boolean z4 = dialog.remote_;
                    this.remote_ = hVar.d(z3, z3, z4, z4);
                    boolean z5 = this.cancelAble_;
                    boolean z6 = dialog.cancelAble_;
                    this.cancelAble_ = hVar.d(z5, z5, z6, z6);
                    boolean z7 = this.blockCard_;
                    boolean z8 = dialog.blockCard_;
                    this.blockCard_ = hVar.d(z7, z7, z8, z8);
                    this.constraint_ = hVar.o(this.constraint_, dialog.constraint_);
                    this.position_ = hVar.o(this.position_, dialog.position_);
                    this.mercury_ = hVar.o(this.mercury_, dialog.mercury_);
                    this.contentType_ = hVar.f(!this.contentType_.isEmpty(), this.contentType_, !dialog.contentType_.isEmpty(), dialog.contentType_);
                    this.content_ = hVar.o(this.content_, dialog.content_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            switch (iM) {
                                case 0:
                                    break;
                                case 10:
                                    this.id_ = eVar.L();
                                    continue;
                                case 18:
                                    this.identifier_ = eVar.L();
                                    continue;
                                case 24:
                                    this.version_ = eVar.u();
                                    continue;
                                case LongLinkChatMessage.LiveChatMessage.SOURCE_FIELD_NUMBER /* 32 */:
                                    this.remote_ = eVar.m();
                                    continue;
                                case 40:
                                    this.cancelAble_ = eVar.m();
                                    continue;
                                case 48:
                                    this.blockCard_ = eVar.m();
                                    continue;
                                case 58:
                                    Constraint constraint = this.constraint_;
                                    Constraint.Builder builder = constraint != null ? (Constraint.Builder) constraint.toBuilder() : null;
                                    Constraint constraintW = eVar.w(Constraint.parser(), hVar2);
                                    this.constraint_ = constraintW;
                                    if (builder != null) {
                                        builder.mergeFrom(constraintW);
                                        this.constraint_ = (Constraint) builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 66:
                                    Position position = this.position_;
                                    Position.Builder builder2 = position != null ? (Position.Builder) position.toBuilder() : null;
                                    Position positionW = eVar.w(Position.parser(), hVar2);
                                    this.position_ = positionW;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(positionW);
                                        this.position_ = (Position) builder2.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    Mercury mercury = this.mercury_;
                                    Mercury.Builder builder3 = mercury != null ? (Mercury.Builder) mercury.toBuilder() : null;
                                    Mercury mercuryW = eVar.w(Mercury.parser(), hVar2);
                                    this.mercury_ = mercuryW;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(mercuryW);
                                        this.mercury_ = (Mercury) builder3.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 82:
                                    this.contentType_ = eVar.L();
                                    continue;
                                case 90:
                                    Content content = this.content_;
                                    Content.Builder builder4 = content != null ? (Content.Builder) content.toBuilder() : null;
                                    Content contentW = eVar.w(Content.parser(), hVar2);
                                    this.content_ = contentW;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(contentW);
                                        this.content_ = (Content) builder4.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!eVar.R(iM)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Dialog.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean getBlockCard() {
            return this.blockCard_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean getCancelAble() {
            return this.cancelAble_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public Constraint getConstraint() {
            Constraint constraint = this.constraint_;
            return constraint == null ? Constraint.getDefaultInstance() : constraint;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public Content getContent() {
            Content content = this.content_;
            return content == null ? Content.getDefaultInstance() : content;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public String getContentType() {
            return this.contentType_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public ByteString getContentTypeBytes() {
            return ByteString.copyFromUtf8(this.contentType_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public String getIdentifier() {
            return this.identifier_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public ByteString getIdentifierBytes() {
            return ByteString.copyFromUtf8(this.identifier_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public Mercury getMercury() {
            Mercury mercury = this.mercury_;
            return mercury == null ? Mercury.getDefaultInstance() : mercury;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public Position getPosition() {
            Position position = this.position_;
            return position == null ? Position.getDefaultInstance() : position;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean getRemote() {
            return this.remote_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.identifier_.isEmpty()) {
                iK += CodedOutputStream.K(2, getIdentifier());
            }
            int i2 = this.version_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(3, i2);
            }
            boolean z = this.remote_;
            if (z) {
                iK += CodedOutputStream.f(4, z);
            }
            boolean z2 = this.cancelAble_;
            if (z2) {
                iK += CodedOutputStream.f(5, z2);
            }
            boolean z3 = this.blockCard_;
            if (z3) {
                iK += CodedOutputStream.f(6, z3);
            }
            if (this.constraint_ != null) {
                iK += CodedOutputStream.C(7, getConstraint());
            }
            if (this.position_ != null) {
                iK += CodedOutputStream.C(8, getPosition());
            }
            if (this.mercury_ != null) {
                iK += CodedOutputStream.C(9, getMercury());
            }
            if (!this.contentType_.isEmpty()) {
                iK += CodedOutputStream.K(10, getContentType());
            }
            if (this.content_ != null) {
                iK += CodedOutputStream.C(11, getContent());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean hasConstraint() {
            return this.constraint_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean hasContent() {
            return this.content_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean hasMercury() {
            return this.mercury_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
        public boolean hasPosition() {
            return this.position_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.identifier_.isEmpty()) {
                codedOutputStream.D0(2, getIdentifier());
            }
            int i = this.version_;
            if (i != 0) {
                codedOutputStream.s0(3, i);
            }
            boolean z = this.remote_;
            if (z) {
                codedOutputStream.a0(4, z);
            }
            boolean z2 = this.cancelAble_;
            if (z2) {
                codedOutputStream.a0(5, z2);
            }
            boolean z3 = this.blockCard_;
            if (z3) {
                codedOutputStream.a0(6, z3);
            }
            if (this.constraint_ != null) {
                codedOutputStream.w0(7, getConstraint());
            }
            if (this.position_ != null) {
                codedOutputStream.w0(8, getPosition());
            }
            if (this.mercury_ != null) {
                codedOutputStream.w0(9, getMercury());
            }
            if (!this.contentType_.isEmpty()) {
                codedOutputStream.D0(10, getContentType());
            }
            if (this.content_ != null) {
                codedOutputStream.w0(11, getContent());
            }
        }

        public static Dialog parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Dialog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Dialog parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConstraint(Constraint constraint) {
            constraint.getClass();
            this.constraint_ = constraint;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(Content content) {
            content.getClass();
            this.content_ = content;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMercury(Mercury mercury) {
            mercury.getClass();
            this.mercury_ = mercury;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPosition(Position position) {
            position.getClass();
            this.position_ = position;
        }

        public static final class Builder extends GeneratedMessageLite.b<Dialog, Builder> implements DialogOrBuilder {
            private Builder() {
                super(Dialog.DEFAULT_INSTANCE);
            }

            public Builder clearBlockCard() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearBlockCard();
                return this;
            }

            public Builder clearCancelAble() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearCancelAble();
                return this;
            }

            public Builder clearConstraint() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearConstraint();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearContent();
                return this;
            }

            public Builder clearContentType() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearContentType();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearIdentifier() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearIdentifier();
                return this;
            }

            public Builder clearMercury() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearMercury();
                return this;
            }

            public Builder clearPosition() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearPosition();
                return this;
            }

            public Builder clearRemote() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearRemote();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).clearVersion();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean getBlockCard() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getBlockCard();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean getCancelAble() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getCancelAble();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public Constraint getConstraint() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getConstraint();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public Content getContent() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getContent();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public String getContentType() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getContentType();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public ByteString getContentTypeBytes() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getContentTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public String getId() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public ByteString getIdBytes() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public String getIdentifier() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getIdentifier();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public ByteString getIdentifierBytes() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getIdentifierBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public Mercury getMercury() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getMercury();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public Position getPosition() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getPosition();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean getRemote() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getRemote();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public int getVersion() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).getVersion();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean hasConstraint() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).hasConstraint();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean hasContent() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).hasContent();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean hasMercury() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).hasMercury();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogOrBuilder
            public boolean hasPosition() {
                return ((Dialog) ((GeneratedMessageLite.b) this).instance).hasPosition();
            }

            public Builder mergeConstraint(Constraint constraint) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).mergeConstraint(constraint);
                return this;
            }

            public Builder mergeContent(Content content) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).mergeContent(content);
                return this;
            }

            public Builder mergeMercury(Mercury mercury) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).mergeMercury(mercury);
                return this;
            }

            public Builder mergePosition(Position position) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).mergePosition(position);
                return this;
            }

            public Builder setBlockCard(boolean z) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setBlockCard(z);
                return this;
            }

            public Builder setCancelAble(boolean z) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setCancelAble(z);
                return this;
            }

            public Builder setConstraint(Constraint constraint) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setConstraint(constraint);
                return this;
            }

            public Builder setContent(Content content) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setContent(content);
                return this;
            }

            public Builder setContentType(String str) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setContentType(str);
                return this;
            }

            public Builder setContentTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setContentTypeBytes(byteString);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setIdentifier(String str) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setIdentifier(str);
                return this;
            }

            public Builder setIdentifierBytes(ByteString byteString) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setIdentifierBytes(byteString);
                return this;
            }

            public Builder setMercury(Mercury mercury) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setMercury(mercury);
                return this;
            }

            public Builder setPosition(Position position) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setPosition(position);
                return this;
            }

            public Builder setRemote(boolean z) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setRemote(z);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setVersion(i);
                return this;
            }

            public Builder setConstraint(Constraint.Builder builder) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setConstraint(builder);
                return this;
            }

            public Builder setContent(Content.Builder builder) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setContent(builder);
                return this;
            }

            public Builder setMercury(Mercury.Builder builder) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setMercury(builder);
                return this;
            }

            public Builder setPosition(Position.Builder builder) {
                copyOnWrite();
                ((Dialog) ((GeneratedMessageLite.b) this).instance).setPosition(builder);
                return this;
            }
        }

        public static Dialog parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Dialog parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Dialog parseFrom(InputStream inputStream) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialog parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Dialog parseFrom(e eVar) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Dialog parseFrom(e eVar, h hVar) throws IOException {
            return (Dialog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Dialogs extends GeneratedMessageLite<Dialogs, Builder> implements DialogsOrBuilder {
        private static final Dialogs DEFAULT_INSTANCE;
        public static final int DIALOGS_FIELD_NUMBER = 1;
        private static volatile i860<Dialogs> PARSER;
        private l.h<Dialog> dialogs_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Dialogs dialogs = new Dialogs();
            DEFAULT_INSTANCE = dialogs;
            dialogs.makeImmutable();
        }

        private Dialogs() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDialogs(Iterable<? extends Dialog> iterable) {
            ensureDialogsIsMutable();
            a.addAll(iterable, this.dialogs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDialogs(Dialog.Builder builder) {
            ensureDialogsIsMutable();
            this.dialogs_.add((Dialog) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialogs() {
            this.dialogs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDialogsIsMutable() {
            if (this.dialogs_.q()) {
                return;
            }
            this.dialogs_ = GeneratedMessageLite.mutableCopy(this.dialogs_);
        }

        public static Dialogs getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Dialogs dialogs) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(dialogs);
        }

        public static Dialogs parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialogs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Dialogs> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDialogs(int i) {
            ensureDialogsIsMutable();
            this.dialogs_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialogs(int i, Dialog.Builder builder) {
            ensureDialogsIsMutable();
            this.dialogs_.set(i, (Dialog) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Dialogs();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.dialogs_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    this.dialogs_ = ((GeneratedMessageLite.h) obj).g(this.dialogs_, ((Dialogs) obj2).dialogs_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    if (!this.dialogs_.q()) {
                                        this.dialogs_ = GeneratedMessageLite.mutableCopy(this.dialogs_);
                                    }
                                    this.dialogs_.add(eVar.w(Dialog.parser(), hVar));
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Dialogs.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
        public Dialog getDialogs(int i) {
            return (Dialog) this.dialogs_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
        public int getDialogsCount() {
            return this.dialogs_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
        public List<Dialog> getDialogsList() {
            return this.dialogs_;
        }

        public DialogOrBuilder getDialogsOrBuilder(int i) {
            return (DialogOrBuilder) this.dialogs_.get(i);
        }

        public List<? extends DialogOrBuilder> getDialogsOrBuilderList() {
            return this.dialogs_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iC = 0;
            for (int i2 = 0; i2 < this.dialogs_.size(); i2++) {
                iC += CodedOutputStream.C(1, (q) this.dialogs_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iC;
            return iC;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.dialogs_.size(); i++) {
                codedOutputStream.w0(1, (q) this.dialogs_.get(i));
            }
        }

        public static Dialogs parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Dialogs parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<Dialogs, Builder> implements DialogsOrBuilder {
            private Builder() {
                super(Dialogs.DEFAULT_INSTANCE);
            }

            public Builder addAllDialogs(Iterable<? extends Dialog> iterable) {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).addAllDialogs(iterable);
                return this;
            }

            public Builder addDialogs(Dialog dialog) {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).addDialogs(dialog);
                return this;
            }

            public Builder clearDialogs() {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).clearDialogs();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
            public Dialog getDialogs(int i) {
                return ((Dialogs) ((GeneratedMessageLite.b) this).instance).getDialogs(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
            public int getDialogsCount() {
                return ((Dialogs) ((GeneratedMessageLite.b) this).instance).getDialogsCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.DialogsOrBuilder
            public List<Dialog> getDialogsList() {
                return Collections.unmodifiableList(((Dialogs) ((GeneratedMessageLite.b) this).instance).getDialogsList());
            }

            public Builder removeDialogs(int i) {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).removeDialogs(i);
                return this;
            }

            public Builder setDialogs(int i, Dialog dialog) {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).setDialogs(i, dialog);
                return this;
            }

            public Builder addDialogs(int i, Dialog dialog) {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).addDialogs(i, dialog);
                return this;
            }

            public Builder setDialogs(int i, Dialog.Builder builder) {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).setDialogs(i, builder);
                return this;
            }

            public Builder addDialogs(Dialog.Builder builder) {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).addDialogs(builder);
                return this;
            }

            public Builder addDialogs(int i, Dialog.Builder builder) {
                copyOnWrite();
                ((Dialogs) ((GeneratedMessageLite.b) this).instance).addDialogs(i, builder);
                return this;
            }
        }

        public static Dialogs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Dialogs parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Dialogs parseFrom(InputStream inputStream) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Dialogs parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Dialogs parseFrom(e eVar) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDialogs(int i, Dialog dialog) {
            dialog.getClass();
            ensureDialogsIsMutable();
            this.dialogs_.add(i, dialog);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Dialogs parseFrom(e eVar, h hVar) throws IOException {
            return (Dialogs) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialogs(int i, Dialog dialog) {
            dialog.getClass();
            ensureDialogsIsMutable();
            this.dialogs_.set(i, dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDialogs(Dialog dialog) {
            dialog.getClass();
            ensureDialogsIsMutable();
            this.dialogs_.add(dialog);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDialogs(int i, Dialog.Builder builder) {
            ensureDialogsIsMutable();
            this.dialogs_.add(i, (Dialog) builder.build());
        }
    }

    public static final class Layout extends GeneratedMessageLite<Layout, Builder> implements LayoutOrBuilder {
        private static final Layout DEFAULT_INSTANCE;
        private static volatile i860<Layout> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private String type_ = "";
        private double value_;

        public static final class Builder extends GeneratedMessageLite.b<Layout, Builder> implements LayoutOrBuilder {
            private Builder() {
                super(Layout.DEFAULT_INSTANCE);
            }

            public Builder clearType() {
                copyOnWrite();
                ((Layout) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((Layout) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
            public String getType() {
                return ((Layout) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
            public ByteString getTypeBytes() {
                return ((Layout) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
            public double getValue() {
                return ((Layout) ((GeneratedMessageLite.b) this).instance).getValue();
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Layout) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Layout) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setValue(double d) {
                copyOnWrite();
                ((Layout) ((GeneratedMessageLite.b) this).instance).setValue(d);
                return this;
            }
        }

        static {
            Layout layout = new Layout();
            DEFAULT_INSTANCE = layout;
            layout.makeImmutable();
        }

        private Layout() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = 0.0d;
        }

        public static Layout getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Layout layout) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(layout);
        }

        public static Layout parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Layout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Layout parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Layout> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(double d) {
            this.value_ = d;
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Layout();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Layout layout = (Layout) obj2;
                    this.type_ = hVar.f(!this.type_.isEmpty(), this.type_, !layout.type_.isEmpty(), layout.type_);
                    double d = this.value_;
                    boolean z2 = d != 0.0d;
                    double d2 = layout.value_;
                    this.value_ = hVar.j(z2, d, d2 != 0.0d, d2);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.type_ = eVar.L();
                                } else if (iM == 17) {
                                    this.value_ = eVar.o();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Layout.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.type_.isEmpty() ? CodedOutputStream.K(1, getType()) : 0;
            double d = this.value_;
            if (d != 0.0d) {
                iK += CodedOutputStream.k(2, d);
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.LayoutOrBuilder
        public double getValue() {
            return this.value_;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.type_.isEmpty()) {
                codedOutputStream.D0(1, getType());
            }
            double d = this.value_;
            if (d != 0.0d) {
                codedOutputStream.g0(2, d);
            }
        }

        public static Layout parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Layout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Layout parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Layout parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Layout parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Layout parseFrom(InputStream inputStream) throws IOException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Layout parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Layout parseFrom(e eVar) throws IOException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Layout parseFrom(e eVar, h hVar) throws IOException {
            return (Layout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Mercury extends GeneratedMessageLite<Mercury, Builder> implements MercuryOrBuilder {
        private static final Mercury DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<Mercury> PARSER = null;
        public static final int SERVER_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 2;
        private int bitField0_;
        private MapFieldLite<String, String> server_ = MapFieldLite.emptyMapField();
        private String id_ = "";
        private String type_ = "";

        public static final class Builder extends GeneratedMessageLite.b<Mercury, Builder> implements MercuryOrBuilder {
            private Builder() {
                super(Mercury.DEFAULT_INSTANCE);
            }

            public Builder clearId() {
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearServer() {
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).getMutableServerMap().clear();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public boolean containsServer(String str) {
                str.getClass();
                return ((Mercury) ((GeneratedMessageLite.b) this).instance).getServerMap().containsKey(str);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public String getId() {
                return ((Mercury) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public ByteString getIdBytes() {
                return ((Mercury) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            @Deprecated
            public Map<String, String> getServer() {
                return getServerMap();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public int getServerCount() {
                return ((Mercury) ((GeneratedMessageLite.b) this).instance).getServerMap().size();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public Map<String, String> getServerMap() {
                return Collections.unmodifiableMap(((Mercury) ((GeneratedMessageLite.b) this).instance).getServerMap());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public String getServerOrDefault(String str, String str2) {
                str.getClass();
                Map<String, String> serverMap = ((Mercury) ((GeneratedMessageLite.b) this).instance).getServerMap();
                return serverMap.containsKey(str) ? serverMap.get(str) : str2;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public String getServerOrThrow(String str) {
                str.getClass();
                Map<String, String> serverMap = ((Mercury) ((GeneratedMessageLite.b) this).instance).getServerMap();
                if (serverMap.containsKey(str)) {
                    return serverMap.get(str);
                }
                x9g0.a();
                return null;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public String getType() {
                return ((Mercury) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
            public ByteString getTypeBytes() {
                return ((Mercury) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            public Builder putAllServer(Map<String, String> map) {
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).getMutableServerMap().putAll(map);
                return this;
            }

            public Builder putServer(String str, String str2) {
                str.getClass();
                str2.getClass();
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).getMutableServerMap().put(str, str2);
                return this;
            }

            public Builder removeServer(String str) {
                str.getClass();
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).getMutableServerMap().remove(str);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((Mercury) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }
        }

        public static final class ServerDefaultEntryHolder {
            static final p<String, String> defaultEntry;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = p.c(fieldType, "", fieldType, "");
            }

            private ServerDefaultEntryHolder() {
            }
        }

        static {
            Mercury mercury = new Mercury();
            DEFAULT_INSTANCE = mercury;
            mercury.makeImmutable();
        }

        private Mercury() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static Mercury getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, String> getMutableServerMap() {
            return internalGetMutableServer();
        }

        private MapFieldLite<String, String> internalGetMutableServer() {
            if (!this.server_.isMutable()) {
                this.server_ = this.server_.mutableCopy();
            }
            return this.server_;
        }

        private MapFieldLite<String, String> internalGetServer() {
            return this.server_;
        }

        public static Builder newBuilder(Mercury mercury) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(mercury);
        }

        public static Mercury parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Mercury) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mercury parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Mercury> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public boolean containsServer(String str) {
            str.getClass();
            return internalGetServer().containsKey(str);
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Mercury();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.server_.makeImmutable();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    Mercury mercury = (Mercury) obj2;
                    this.id_ = gVar.f(!this.id_.isEmpty(), this.id_, !mercury.id_.isEmpty(), mercury.id_);
                    this.type_ = gVar.f(!this.type_.isEmpty(), this.type_, true ^ mercury.type_.isEmpty(), mercury.type_);
                    this.server_ = gVar.l(this.server_, mercury.internalGetServer());
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= mercury.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.type_ = eVar.L();
                                } else if (iM == 26) {
                                    if (!this.server_.isMutable()) {
                                        this.server_ = this.server_.mutableCopy();
                                    }
                                    ServerDefaultEntryHolder.defaultEntry.e(this.server_, eVar, hVar);
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Mercury.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.type_.isEmpty()) {
                iK += CodedOutputStream.K(2, getType());
            }
            for (Map.Entry entry : internalGetServer().entrySet()) {
                iK += ServerDefaultEntryHolder.defaultEntry.a(3, (String) entry.getKey(), (String) entry.getValue());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        @Deprecated
        public Map<String, String> getServer() {
            return getServerMap();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public int getServerCount() {
            return internalGetServer().size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public Map<String, String> getServerMap() {
            return Collections.unmodifiableMap(internalGetServer());
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public String getServerOrDefault(String str, String str2) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetServer = internalGetServer();
            return mapFieldLiteInternalGetServer.containsKey(str) ? (String) mapFieldLiteInternalGetServer.get(str) : str2;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public String getServerOrThrow(String str) {
            str.getClass();
            MapFieldLite<String, String> mapFieldLiteInternalGetServer = internalGetServer();
            if (mapFieldLiteInternalGetServer.containsKey(str)) {
                return (String) mapFieldLiteInternalGetServer.get(str);
            }
            x9g0.a();
            return null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.MercuryOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.D0(2, getType());
            }
            for (Map.Entry entry : internalGetServer().entrySet()) {
                ServerDefaultEntryHolder.defaultEntry.f(codedOutputStream, 3, (String) entry.getKey(), (String) entry.getValue());
            }
        }

        public static Mercury parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Mercury) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Mercury parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Mercury parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Mercury parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Mercury parseFrom(InputStream inputStream) throws IOException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Mercury parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Mercury parseFrom(e eVar) throws IOException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Mercury parseFrom(e eVar, h hVar) throws IOException {
            return (Mercury) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class NodeContent extends GeneratedMessageLite<NodeContent, Builder> implements NodeContentOrBuilder {
        public static final int BACKGROUNDCOLOR_FIELD_NUMBER = 5;
        public static final int COLOR_FIELD_NUMBER = 2;
        private static final NodeContent DEFAULT_INSTANCE;
        public static final int FONT_FIELD_NUMBER = 4;
        private static volatile i860<NodeContent> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 3;
        public static final int STRIKETHROUGH_FIELD_NUMBER = 6;
        public static final int UNDERLINE_FIELD_NUMBER = 7;
        public static final int URL_FIELD_NUMBER = 8;
        public static final int VALUE_FIELD_NUMBER = 1;
        private int size_;
        private boolean strikethrough_;
        private boolean underline_;
        private String value_ = "";
        private String color_ = "";
        private String font_ = "";
        private String backgroundColor_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.b<NodeContent, Builder> implements NodeContentOrBuilder {
            private Builder() {
                super(NodeContent.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundColor() {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).clearBackgroundColor();
                return this;
            }

            public Builder clearColor() {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).clearColor();
                return this;
            }

            public Builder clearFont() {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).clearFont();
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).clearSize();
                return this;
            }

            public Builder clearStrikethrough() {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).clearStrikethrough();
                return this;
            }

            public Builder clearUnderline() {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).clearUnderline();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).clearValue();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getBackgroundColor() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getBackgroundColor();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getBackgroundColorBytes() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getBackgroundColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getColor() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getColor();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getColorBytes() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getColorBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getFont() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getFont();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getFontBytes() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getFontBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public int getSize() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getSize();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public boolean getStrikethrough() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getStrikethrough();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public boolean getUnderline() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getUnderline();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getUrl() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getUrlBytes() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public String getValue() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getValue();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
            public ByteString getValueBytes() {
                return ((NodeContent) ((GeneratedMessageLite.b) this).instance).getValueBytes();
            }

            public Builder setBackgroundColor(String str) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setBackgroundColor(str);
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setBackgroundColorBytes(byteString);
                return this;
            }

            public Builder setColor(String str) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setColor(str);
                return this;
            }

            public Builder setColorBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setColorBytes(byteString);
                return this;
            }

            public Builder setFont(String str) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setFont(str);
                return this;
            }

            public Builder setFontBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setFontBytes(byteString);
                return this;
            }

            public Builder setSize(int i) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setSize(i);
                return this;
            }

            public Builder setStrikethrough(boolean z) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setStrikethrough(z);
                return this;
            }

            public Builder setUnderline(boolean z) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setUnderline(z);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setValue(str);
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                copyOnWrite();
                ((NodeContent) ((GeneratedMessageLite.b) this).instance).setValueBytes(byteString);
                return this;
            }
        }

        static {
            NodeContent nodeContent = new NodeContent();
            DEFAULT_INSTANCE = nodeContent;
            nodeContent.makeImmutable();
        }

        private NodeContent() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBackgroundColor() {
            this.backgroundColor_ = getDefaultInstance().getBackgroundColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColor() {
            this.color_ = getDefaultInstance().getColor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFont() {
            this.font_ = getDefaultInstance().getFont();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStrikethrough() {
            this.strikethrough_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnderline() {
            this.underline_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        public static NodeContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(NodeContent nodeContent) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(nodeContent);
        }

        public static NodeContent parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NodeContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<NodeContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColor(String str) {
            str.getClass();
            this.backgroundColor_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBackgroundColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.backgroundColor_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColor(String str) {
            str.getClass();
            this.color_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.color_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFont(String str) {
            str.getClass();
            this.font_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFontBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.font_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(int i) {
            this.size_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStrikethrough(boolean z) {
            this.strikethrough_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnderline(boolean z) {
            this.underline_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new NodeContent();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    NodeContent nodeContent = (NodeContent) obj2;
                    this.value_ = hVar.f(!this.value_.isEmpty(), this.value_, !nodeContent.value_.isEmpty(), nodeContent.value_);
                    this.color_ = hVar.f(!this.color_.isEmpty(), this.color_, !nodeContent.color_.isEmpty(), nodeContent.color_);
                    int i = this.size_;
                    boolean z2 = i != 0;
                    int i2 = nodeContent.size_;
                    this.size_ = hVar.e(z2, i, i2 != 0, i2);
                    this.font_ = hVar.f(!this.font_.isEmpty(), this.font_, !nodeContent.font_.isEmpty(), nodeContent.font_);
                    this.backgroundColor_ = hVar.f(!this.backgroundColor_.isEmpty(), this.backgroundColor_, !nodeContent.backgroundColor_.isEmpty(), nodeContent.backgroundColor_);
                    boolean z3 = this.strikethrough_;
                    boolean z4 = nodeContent.strikethrough_;
                    this.strikethrough_ = hVar.d(z3, z3, z4, z4);
                    boolean z5 = this.underline_;
                    boolean z6 = nodeContent.underline_;
                    this.underline_ = hVar.d(z5, z5, z6, z6);
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, !nodeContent.url_.isEmpty(), nodeContent.url_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.value_ = eVar.L();
                                } else if (iM == 18) {
                                    this.color_ = eVar.L();
                                } else if (iM == 24) {
                                    this.size_ = eVar.u();
                                } else if (iM == 34) {
                                    this.font_ = eVar.L();
                                } else if (iM == 42) {
                                    this.backgroundColor_ = eVar.L();
                                } else if (iM == 48) {
                                    this.strikethrough_ = eVar.m();
                                } else if (iM == 56) {
                                    this.underline_ = eVar.m();
                                } else if (iM == 66) {
                                    this.url_ = eVar.L();
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (NodeContent.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getBackgroundColor() {
            return this.backgroundColor_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getBackgroundColorBytes() {
            return ByteString.copyFromUtf8(this.backgroundColor_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getColor() {
            return this.color_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getColorBytes() {
            return ByteString.copyFromUtf8(this.color_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getFont() {
            return this.font_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getFontBytes() {
            return ByteString.copyFromUtf8(this.font_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.value_.isEmpty() ? CodedOutputStream.K(1, getValue()) : 0;
            if (!this.color_.isEmpty()) {
                iK += CodedOutputStream.K(2, getColor());
            }
            int i2 = this.size_;
            if (i2 != 0) {
                iK += CodedOutputStream.t(3, i2);
            }
            if (!this.font_.isEmpty()) {
                iK += CodedOutputStream.K(4, getFont());
            }
            if (!this.backgroundColor_.isEmpty()) {
                iK += CodedOutputStream.K(5, getBackgroundColor());
            }
            boolean z = this.strikethrough_;
            if (z) {
                iK += CodedOutputStream.f(6, z);
            }
            boolean z2 = this.underline_;
            if (z2) {
                iK += CodedOutputStream.f(7, z2);
            }
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(8, getUrl());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public int getSize() {
            return this.size_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public boolean getStrikethrough() {
            return this.strikethrough_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public boolean getUnderline() {
            return this.underline_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.NodeContentOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.value_.isEmpty()) {
                codedOutputStream.D0(1, getValue());
            }
            if (!this.color_.isEmpty()) {
                codedOutputStream.D0(2, getColor());
            }
            int i = this.size_;
            if (i != 0) {
                codedOutputStream.s0(3, i);
            }
            if (!this.font_.isEmpty()) {
                codedOutputStream.D0(4, getFont());
            }
            if (!this.backgroundColor_.isEmpty()) {
                codedOutputStream.D0(5, getBackgroundColor());
            }
            boolean z = this.strikethrough_;
            if (z) {
                codedOutputStream.a0(6, z);
            }
            boolean z2 = this.underline_;
            if (z2) {
                codedOutputStream.a0(7, z2);
            }
            if (this.url_.isEmpty()) {
                return;
            }
            codedOutputStream.D0(8, getUrl());
        }

        public static NodeContent parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static NodeContent parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static NodeContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NodeContent parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static NodeContent parseFrom(InputStream inputStream) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NodeContent parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static NodeContent parseFrom(e eVar) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static NodeContent parseFrom(e eVar, h hVar) throws IOException {
            return (NodeContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Position extends GeneratedMessageLite<Position, Builder> implements PositionOrBuilder {
        public static final int CONTAIN_FIELD_NUMBER = 2;
        private static final Position DEFAULT_INSTANCE;
        public static final int EXCLUDE_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile i860<Position> PARSER;
        private int bitField0_;
        private String id_ = "";
        private l.h<String> contain_ = GeneratedMessageLite.emptyProtobufList();
        private l.h<String> exclude_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.b<Position, Builder> implements PositionOrBuilder {
            private Builder() {
                super(Position.DEFAULT_INSTANCE);
            }

            public Builder addAllContain(Iterable<String> iterable) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).addAllContain(iterable);
                return this;
            }

            public Builder addAllExclude(Iterable<String> iterable) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).addAllExclude(iterable);
                return this;
            }

            public Builder addContain(String str) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).addContain(str);
                return this;
            }

            public Builder addContainBytes(ByteString byteString) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).addContainBytes(byteString);
                return this;
            }

            public Builder addExclude(String str) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).addExclude(str);
                return this;
            }

            public Builder addExcludeBytes(ByteString byteString) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).addExcludeBytes(byteString);
                return this;
            }

            public Builder clearContain() {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).clearContain();
                return this;
            }

            public Builder clearExclude() {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).clearExclude();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public String getContain(int i) {
                return ((Position) ((GeneratedMessageLite.b) this).instance).getContain(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public ByteString getContainBytes(int i) {
                return ((Position) ((GeneratedMessageLite.b) this).instance).getContainBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public int getContainCount() {
                return ((Position) ((GeneratedMessageLite.b) this).instance).getContainCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public List<String> getContainList() {
                return Collections.unmodifiableList(((Position) ((GeneratedMessageLite.b) this).instance).getContainList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public String getExclude(int i) {
                return ((Position) ((GeneratedMessageLite.b) this).instance).getExclude(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public ByteString getExcludeBytes(int i) {
                return ((Position) ((GeneratedMessageLite.b) this).instance).getExcludeBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public int getExcludeCount() {
                return ((Position) ((GeneratedMessageLite.b) this).instance).getExcludeCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public List<String> getExcludeList() {
                return Collections.unmodifiableList(((Position) ((GeneratedMessageLite.b) this).instance).getExcludeList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public String getId() {
                return ((Position) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
            public ByteString getIdBytes() {
                return ((Position) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            public Builder setContain(int i, String str) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).setContain(i, str);
                return this;
            }

            public Builder setExclude(int i, String str) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).setExclude(i, str);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Position) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }
        }

        static {
            Position position = new Position();
            DEFAULT_INSTANCE = position;
            position.makeImmutable();
        }

        private Position() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllContain(Iterable<String> iterable) {
            ensureContainIsMutable();
            a.addAll(iterable, this.contain_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllExclude(Iterable<String> iterable) {
            ensureExcludeIsMutable();
            a.addAll(iterable, this.exclude_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContain(String str) {
            str.getClass();
            ensureContainIsMutable();
            this.contain_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContainBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureContainIsMutable();
            this.contain_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExclude(String str) {
            str.getClass();
            ensureExcludeIsMutable();
            this.exclude_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addExcludeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureExcludeIsMutable();
            this.exclude_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContain() {
            this.contain_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExclude() {
            this.exclude_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        private void ensureContainIsMutable() {
            if (this.contain_.q()) {
                return;
            }
            this.contain_ = GeneratedMessageLite.mutableCopy(this.contain_);
        }

        private void ensureExcludeIsMutable() {
            if (this.exclude_.q()) {
                return;
            }
            this.exclude_ = GeneratedMessageLite.mutableCopy(this.exclude_);
        }

        public static Position getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Position position) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(position);
        }

        public static Position parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Position) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Position parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Position> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContain(int i, String str) {
            str.getClass();
            ensureContainIsMutable();
            this.contain_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExclude(int i, String str) {
            str.getClass();
            ensureExcludeIsMutable();
            this.exclude_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Position();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.contain_.n();
                    this.exclude_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    Position position = (Position) obj2;
                    this.id_ = gVar.f(!this.id_.isEmpty(), this.id_, true ^ position.id_.isEmpty(), position.id_);
                    this.contain_ = gVar.g(this.contain_, position.contain_);
                    this.exclude_ = gVar.g(this.exclude_, position.exclude_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= position.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    String strL = eVar.L();
                                    if (!this.contain_.q()) {
                                        this.contain_ = GeneratedMessageLite.mutableCopy(this.contain_);
                                    }
                                    this.contain_.add(strL);
                                } else if (iM == 26) {
                                    String strL2 = eVar.L();
                                    if (!this.exclude_.q()) {
                                        this.exclude_ = GeneratedMessageLite.mutableCopy(this.exclude_);
                                    }
                                    this.exclude_.add(strL2);
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            aag0.a(e.setUnfinishedMessage(this));
                            return null;
                        } catch (IOException e2) {
                            aag0.a(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Position.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public String getContain(int i) {
            return (String) this.contain_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public ByteString getContainBytes(int i) {
            return ByteString.copyFromUtf8((String) this.contain_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public int getContainCount() {
            return this.contain_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public List<String> getContainList() {
            return this.contain_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public String getExclude(int i) {
            return (String) this.exclude_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public ByteString getExcludeBytes(int i) {
            return ByteString.copyFromUtf8((String) this.exclude_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public int getExcludeCount() {
            return this.exclude_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public List<String> getExcludeList() {
            return this.exclude_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.PositionOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            int iL = 0;
            for (int i2 = 0; i2 < this.contain_.size(); i2++) {
                iL += CodedOutputStream.L((String) this.contain_.get(i2));
            }
            int size = iK + iL + getContainList().size();
            int iL2 = 0;
            for (int i3 = 0; i3 < this.exclude_.size(); i3++) {
                iL2 += CodedOutputStream.L((String) this.exclude_.get(i3));
            }
            int size2 = size + iL2 + getExcludeList().size();
            ((GeneratedMessageLite) this).memoizedSerializedSize = size2;
            return size2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            for (int i = 0; i < this.contain_.size(); i++) {
                codedOutputStream.D0(2, (String) this.contain_.get(i));
            }
            for (int i2 = 0; i2 < this.exclude_.size(); i2++) {
                codedOutputStream.D0(3, (String) this.exclude_.get(i2));
            }
        }

        public static Position parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Position) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Position parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static Position parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Position parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Position parseFrom(InputStream inputStream) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Position parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Position parseFrom(e eVar) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Position parseFrom(e eVar, h hVar) throws IOException {
            return (Position) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }

    public static final class Resource extends GeneratedMessageLite<Resource, Builder> implements ResourceOrBuilder {
        private static final Resource DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int PAGES_FIELD_NUMBER = 3;
        private static volatile i860<Resource> PARSER = null;
        public static final int TEMPLATEID_FIELD_NUMBER = 2;
        private int bitField0_;
        private String id_ = "";
        private String templateID_ = "";
        private l.h<ResourcePage> pages_ = GeneratedMessageLite.emptyProtobufList();

        static {
            Resource resource = new Resource();
            DEFAULT_INSTANCE = resource;
            resource.makeImmutable();
        }

        private Resource() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPages(Iterable<? extends ResourcePage> iterable) {
            ensurePagesIsMutable();
            a.addAll(iterable, this.pages_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPages(ResourcePage.Builder builder) {
            ensurePagesIsMutable();
            this.pages_.add((ResourcePage) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPages() {
            this.pages_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemplateID() {
            this.templateID_ = getDefaultInstance().getTemplateID();
        }

        private void ensurePagesIsMutable() {
            if (this.pages_.q()) {
                return;
            }
            this.pages_ = GeneratedMessageLite.mutableCopy(this.pages_);
        }

        public static Resource getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Resource resource) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(resource);
        }

        public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Resource> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePages(int i) {
            ensurePagesIsMutable();
            this.pages_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.id_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPages(int i, ResourcePage.Builder builder) {
            ensurePagesIsMutable();
            this.pages_.set(i, (ResourcePage) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateID(String str) {
            str.getClass();
            this.templateID_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemplateIDBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.templateID_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Resource();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.pages_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    Resource resource = (Resource) obj2;
                    this.id_ = gVar.f(!this.id_.isEmpty(), this.id_, !resource.id_.isEmpty(), resource.id_);
                    this.templateID_ = gVar.f(!this.templateID_.isEmpty(), this.templateID_, true ^ resource.templateID_.isEmpty(), resource.templateID_);
                    this.pages_ = gVar.g(this.pages_, resource.pages_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= resource.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.id_ = eVar.L();
                                } else if (iM == 18) {
                                    this.templateID_ = eVar.L();
                                } else if (iM == 26) {
                                    if (!this.pages_.q()) {
                                        this.pages_ = GeneratedMessageLite.mutableCopy(this.pages_);
                                    }
                                    this.pages_.add(eVar.w(ResourcePage.parser(), hVar));
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Resource.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public ResourcePage getPages(int i) {
            return (ResourcePage) this.pages_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public int getPagesCount() {
            return this.pages_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public List<ResourcePage> getPagesList() {
            return this.pages_;
        }

        public ResourcePageOrBuilder getPagesOrBuilder(int i) {
            return (ResourcePageOrBuilder) this.pages_.get(i);
        }

        public List<? extends ResourcePageOrBuilder> getPagesOrBuilderList() {
            return this.pages_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.id_.isEmpty() ? CodedOutputStream.K(1, getId()) : 0;
            if (!this.templateID_.isEmpty()) {
                iK += CodedOutputStream.K(2, getTemplateID());
            }
            for (int i2 = 0; i2 < this.pages_.size(); i2++) {
                iK += CodedOutputStream.C(3, (q) this.pages_.get(i2));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public String getTemplateID() {
            return this.templateID_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
        public ByteString getTemplateIDBytes() {
            return ByteString.copyFromUtf8(this.templateID_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.id_.isEmpty()) {
                codedOutputStream.D0(1, getId());
            }
            if (!this.templateID_.isEmpty()) {
                codedOutputStream.D0(2, getTemplateID());
            }
            for (int i = 0; i < this.pages_.size(); i++) {
                codedOutputStream.w0(3, (q) this.pages_.get(i));
            }
        }

        public static Resource parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Resource parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<Resource, Builder> implements ResourceOrBuilder {
            private Builder() {
                super(Resource.DEFAULT_INSTANCE);
            }

            public Builder addAllPages(Iterable<? extends ResourcePage> iterable) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).addAllPages(iterable);
                return this;
            }

            public Builder addPages(ResourcePage resourcePage) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).addPages(resourcePage);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).clearId();
                return this;
            }

            public Builder clearPages() {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).clearPages();
                return this;
            }

            public Builder clearTemplateID() {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).clearTemplateID();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public String getId() {
                return ((Resource) ((GeneratedMessageLite.b) this).instance).getId();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public ByteString getIdBytes() {
                return ((Resource) ((GeneratedMessageLite.b) this).instance).getIdBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public ResourcePage getPages(int i) {
                return ((Resource) ((GeneratedMessageLite.b) this).instance).getPages(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public int getPagesCount() {
                return ((Resource) ((GeneratedMessageLite.b) this).instance).getPagesCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public List<ResourcePage> getPagesList() {
                return Collections.unmodifiableList(((Resource) ((GeneratedMessageLite.b) this).instance).getPagesList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public String getTemplateID() {
                return ((Resource) ((GeneratedMessageLite.b) this).instance).getTemplateID();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceOrBuilder
            public ByteString getTemplateIDBytes() {
                return ((Resource) ((GeneratedMessageLite.b) this).instance).getTemplateIDBytes();
            }

            public Builder removePages(int i) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).removePages(i);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).setId(str);
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).setIdBytes(byteString);
                return this;
            }

            public Builder setPages(int i, ResourcePage resourcePage) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).setPages(i, resourcePage);
                return this;
            }

            public Builder setTemplateID(String str) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).setTemplateID(str);
                return this;
            }

            public Builder setTemplateIDBytes(ByteString byteString) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).setTemplateIDBytes(byteString);
                return this;
            }

            public Builder addPages(int i, ResourcePage resourcePage) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).addPages(i, resourcePage);
                return this;
            }

            public Builder setPages(int i, ResourcePage.Builder builder) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).setPages(i, builder);
                return this;
            }

            public Builder addPages(ResourcePage.Builder builder) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).addPages(builder);
                return this;
            }

            public Builder addPages(int i, ResourcePage.Builder builder) {
                copyOnWrite();
                ((Resource) ((GeneratedMessageLite.b) this).instance).addPages(i, builder);
                return this;
            }
        }

        public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Resource parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Resource parseFrom(InputStream inputStream) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Resource parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Resource parseFrom(e eVar) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPages(int i, ResourcePage resourcePage) {
            resourcePage.getClass();
            ensurePagesIsMutable();
            this.pages_.add(i, resourcePage);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Resource parseFrom(e eVar, h hVar) throws IOException {
            return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPages(int i, ResourcePage resourcePage) {
            resourcePage.getClass();
            ensurePagesIsMutable();
            this.pages_.set(i, resourcePage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPages(ResourcePage resourcePage) {
            resourcePage.getClass();
            ensurePagesIsMutable();
            this.pages_.add(resourcePage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPages(int i, ResourcePage.Builder builder) {
            ensurePagesIsMutable();
            this.pages_.add(i, (ResourcePage) builder.build());
        }
    }

    public static final class ResourceNode extends GeneratedMessageLite<ResourceNode, Builder> implements ResourceNodeOrBuilder {
        public static final int COLORS_FIELD_NUMBER = 8;
        public static final int CONTENTS_FIELD_NUMBER = 2;
        private static final ResourceNode DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 7;
        public static final int INDEX_FIELD_NUMBER = 1;
        public static final int MERCURY_FIELD_NUMBER = 9;
        private static volatile i860<ResourceNode> PARSER = null;
        public static final int SRC_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 6;
        public static final int URL_FIELD_NUMBER = 5;
        private int bitField0_;
        private Mercury mercury_;
        private String index_ = "";
        private l.h<NodeContent> contents_ = GeneratedMessageLite.emptyProtobufList();
        private String src_ = "";
        private String url_ = "";
        private String type_ = "";
        private String direction_ = "";
        private l.h<String> colors_ = GeneratedMessageLite.emptyProtobufList();

        static {
            ResourceNode resourceNode = new ResourceNode();
            DEFAULT_INSTANCE = resourceNode;
            resourceNode.makeImmutable();
        }

        private ResourceNode() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllColors(Iterable<String> iterable) {
            ensureColorsIsMutable();
            a.addAll(iterable, this.colors_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllContents(Iterable<? extends NodeContent> iterable) {
            ensureContentsIsMutable();
            a.addAll(iterable, this.contents_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addColors(String str) {
            str.getClass();
            ensureColorsIsMutable();
            this.colors_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addColorsBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            ensureColorsIsMutable();
            this.colors_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContents(NodeContent.Builder builder) {
            ensureContentsIsMutable();
            this.contents_.add((NodeContent) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColors() {
            this.colors_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContents() {
            this.contents_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDirection() {
            this.direction_ = getDefaultInstance().getDirection();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = getDefaultInstance().getIndex();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMercury() {
            this.mercury_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSrc() {
            this.src_ = getDefaultInstance().getSrc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        private void ensureColorsIsMutable() {
            if (this.colors_.q()) {
                return;
            }
            this.colors_ = GeneratedMessageLite.mutableCopy(this.colors_);
        }

        private void ensureContentsIsMutable() {
            if (this.contents_.q()) {
                return;
            }
            this.contents_ = GeneratedMessageLite.mutableCopy(this.contents_);
        }

        public static ResourceNode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMercury(Mercury mercury) {
            Mercury mercury2 = this.mercury_;
            if (mercury2 == null || mercury2 == Mercury.getDefaultInstance()) {
                this.mercury_ = mercury;
            } else {
                this.mercury_ = (Mercury) ((Mercury.Builder) Mercury.newBuilder(this.mercury_).mergeFrom(mercury)).buildPartial();
            }
        }

        public static Builder newBuilder(ResourceNode resourceNode) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(resourceNode);
        }

        public static ResourceNode parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceNode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ResourceNode> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeContents(int i) {
            ensureContentsIsMutable();
            this.contents_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColors(int i, String str) {
            str.getClass();
            ensureColorsIsMutable();
            this.colors_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContents(int i, NodeContent.Builder builder) {
            ensureContentsIsMutable();
            this.contents_.set(i, (NodeContent) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirection(String str) {
            str.getClass();
            this.direction_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDirectionBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.direction_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(String str) {
            str.getClass();
            this.index_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndexBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.index_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMercury(Mercury.Builder builder) {
            this.mercury_ = (Mercury) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSrc(String str) {
            str.getClass();
            this.src_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSrcBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.src_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.type_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResourceNode();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.contents_.n();
                    this.colors_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    ResourceNode resourceNode = (ResourceNode) obj2;
                    this.index_ = gVar.f(!this.index_.isEmpty(), this.index_, !resourceNode.index_.isEmpty(), resourceNode.index_);
                    this.contents_ = gVar.g(this.contents_, resourceNode.contents_);
                    this.src_ = gVar.f(!this.src_.isEmpty(), this.src_, !resourceNode.src_.isEmpty(), resourceNode.src_);
                    this.url_ = gVar.f(!this.url_.isEmpty(), this.url_, !resourceNode.url_.isEmpty(), resourceNode.url_);
                    this.type_ = gVar.f(!this.type_.isEmpty(), this.type_, !resourceNode.type_.isEmpty(), resourceNode.type_);
                    this.direction_ = gVar.f(!this.direction_.isEmpty(), this.direction_, true ^ resourceNode.direction_.isEmpty(), resourceNode.direction_);
                    this.colors_ = gVar.g(this.colors_, resourceNode.colors_);
                    this.mercury_ = gVar.o(this.mercury_, resourceNode.mercury_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= resourceNode.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.index_ = eVar.L();
                                } else if (iM == 18) {
                                    if (!this.contents_.q()) {
                                        this.contents_ = GeneratedMessageLite.mutableCopy(this.contents_);
                                    }
                                    this.contents_.add(eVar.w(NodeContent.parser(), hVar));
                                } else if (iM == 26) {
                                    this.src_ = eVar.L();
                                } else if (iM == 42) {
                                    this.url_ = eVar.L();
                                } else if (iM == 50) {
                                    this.type_ = eVar.L();
                                } else if (iM == 58) {
                                    this.direction_ = eVar.L();
                                } else if (iM == 66) {
                                    String strL = eVar.L();
                                    if (!this.colors_.q()) {
                                        this.colors_ = GeneratedMessageLite.mutableCopy(this.colors_);
                                    }
                                    this.colors_.add(strL);
                                } else if (iM == 74) {
                                    Mercury mercury = this.mercury_;
                                    Mercury.Builder builder = mercury != null ? (Mercury.Builder) mercury.toBuilder() : null;
                                    Mercury mercuryW = eVar.w(Mercury.parser(), hVar);
                                    this.mercury_ = mercuryW;
                                    if (builder != null) {
                                        builder.mergeFrom(mercuryW);
                                        this.mercury_ = (Mercury) builder.buildPartial();
                                    }
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (ResourceNode.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getColors(int i) {
            return (String) this.colors_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getColorsBytes(int i) {
            return ByteString.copyFromUtf8((String) this.colors_.get(i));
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public int getColorsCount() {
            return this.colors_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public List<String> getColorsList() {
            return this.colors_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public NodeContent getContents(int i) {
            return (NodeContent) this.contents_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public int getContentsCount() {
            return this.contents_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public List<NodeContent> getContentsList() {
            return this.contents_;
        }

        public NodeContentOrBuilder getContentsOrBuilder(int i) {
            return (NodeContentOrBuilder) this.contents_.get(i);
        }

        public List<? extends NodeContentOrBuilder> getContentsOrBuilderList() {
            return this.contents_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getDirection() {
            return this.direction_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getDirectionBytes() {
            return ByteString.copyFromUtf8(this.direction_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getIndex() {
            return this.index_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getIndexBytes() {
            return ByteString.copyFromUtf8(this.index_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public Mercury getMercury() {
            Mercury mercury = this.mercury_;
            return mercury == null ? Mercury.getDefaultInstance() : mercury;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.index_.isEmpty() ? CodedOutputStream.K(1, getIndex()) : 0;
            for (int i2 = 0; i2 < this.contents_.size(); i2++) {
                iK += CodedOutputStream.C(2, (q) this.contents_.get(i2));
            }
            if (!this.src_.isEmpty()) {
                iK += CodedOutputStream.K(3, getSrc());
            }
            if (!this.url_.isEmpty()) {
                iK += CodedOutputStream.K(5, getUrl());
            }
            if (!this.type_.isEmpty()) {
                iK += CodedOutputStream.K(6, getType());
            }
            if (!this.direction_.isEmpty()) {
                iK += CodedOutputStream.K(7, getDirection());
            }
            int iL = 0;
            for (int i3 = 0; i3 < this.colors_.size(); i3++) {
                iL += CodedOutputStream.L((String) this.colors_.get(i3));
            }
            int size = iK + iL + getColorsList().size();
            if (this.mercury_ != null) {
                size += CodedOutputStream.C(9, getMercury());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = size;
            return size;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getSrc() {
            return this.src_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getSrcBytes() {
            return ByteString.copyFromUtf8(this.src_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getType() {
            return this.type_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getTypeBytes() {
            return ByteString.copyFromUtf8(this.type_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
        public boolean hasMercury() {
            return this.mercury_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.index_.isEmpty()) {
                codedOutputStream.D0(1, getIndex());
            }
            for (int i = 0; i < this.contents_.size(); i++) {
                codedOutputStream.w0(2, (q) this.contents_.get(i));
            }
            if (!this.src_.isEmpty()) {
                codedOutputStream.D0(3, getSrc());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(5, getUrl());
            }
            if (!this.type_.isEmpty()) {
                codedOutputStream.D0(6, getType());
            }
            if (!this.direction_.isEmpty()) {
                codedOutputStream.D0(7, getDirection());
            }
            for (int i2 = 0; i2 < this.colors_.size(); i2++) {
                codedOutputStream.D0(8, (String) this.colors_.get(i2));
            }
            if (this.mercury_ != null) {
                codedOutputStream.w0(9, getMercury());
            }
        }

        public static ResourceNode parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ResourceNode parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMercury(Mercury mercury) {
            mercury.getClass();
            this.mercury_ = mercury;
        }

        public static final class Builder extends GeneratedMessageLite.b<ResourceNode, Builder> implements ResourceNodeOrBuilder {
            private Builder() {
                super(ResourceNode.DEFAULT_INSTANCE);
            }

            public Builder addAllColors(Iterable<String> iterable) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).addAllColors(iterable);
                return this;
            }

            public Builder addAllContents(Iterable<? extends NodeContent> iterable) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).addAllContents(iterable);
                return this;
            }

            public Builder addColors(String str) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).addColors(str);
                return this;
            }

            public Builder addColorsBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).addColorsBytes(byteString);
                return this;
            }

            public Builder addContents(NodeContent nodeContent) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).addContents(nodeContent);
                return this;
            }

            public Builder clearColors() {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).clearColors();
                return this;
            }

            public Builder clearContents() {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).clearContents();
                return this;
            }

            public Builder clearDirection() {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).clearDirection();
                return this;
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).clearIndex();
                return this;
            }

            public Builder clearMercury() {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).clearMercury();
                return this;
            }

            public Builder clearSrc() {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).clearSrc();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).clearType();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getColors(int i) {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getColors(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getColorsBytes(int i) {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getColorsBytes(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public int getColorsCount() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getColorsCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public List<String> getColorsList() {
                return Collections.unmodifiableList(((ResourceNode) ((GeneratedMessageLite.b) this).instance).getColorsList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public NodeContent getContents(int i) {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getContents(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public int getContentsCount() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getContentsCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public List<NodeContent> getContentsList() {
                return Collections.unmodifiableList(((ResourceNode) ((GeneratedMessageLite.b) this).instance).getContentsList());
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getDirection() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getDirection();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getDirectionBytes() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getDirectionBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getIndex() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getIndex();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getIndexBytes() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getIndexBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public Mercury getMercury() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getMercury();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getSrc() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getSrc();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getSrcBytes() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getSrcBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getType() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getType();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getTypeBytes() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getTypeBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public String getUrl() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public ByteString getUrlBytes() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourceNodeOrBuilder
            public boolean hasMercury() {
                return ((ResourceNode) ((GeneratedMessageLite.b) this).instance).hasMercury();
            }

            public Builder mergeMercury(Mercury mercury) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).mergeMercury(mercury);
                return this;
            }

            public Builder removeContents(int i) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).removeContents(i);
                return this;
            }

            public Builder setColors(int i, String str) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setColors(i, str);
                return this;
            }

            public Builder setContents(int i, NodeContent nodeContent) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setContents(i, nodeContent);
                return this;
            }

            public Builder setDirection(String str) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setDirection(str);
                return this;
            }

            public Builder setDirectionBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setDirectionBytes(byteString);
                return this;
            }

            public Builder setIndex(String str) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setIndex(str);
                return this;
            }

            public Builder setIndexBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setIndexBytes(byteString);
                return this;
            }

            public Builder setMercury(Mercury mercury) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setMercury(mercury);
                return this;
            }

            public Builder setSrc(String str) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setSrc(str);
                return this;
            }

            public Builder setSrcBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setSrcBytes(byteString);
                return this;
            }

            public Builder setType(String str) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setType(str);
                return this;
            }

            public Builder setTypeBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setTypeBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }

            public Builder addContents(int i, NodeContent nodeContent) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).addContents(i, nodeContent);
                return this;
            }

            public Builder setContents(int i, NodeContent.Builder builder) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setContents(i, builder);
                return this;
            }

            public Builder setMercury(Mercury.Builder builder) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).setMercury(builder);
                return this;
            }

            public Builder addContents(NodeContent.Builder builder) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).addContents(builder);
                return this;
            }

            public Builder addContents(int i, NodeContent.Builder builder) {
                copyOnWrite();
                ((ResourceNode) ((GeneratedMessageLite.b) this).instance).addContents(i, builder);
                return this;
            }
        }

        public static ResourceNode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResourceNode parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static ResourceNode parseFrom(InputStream inputStream) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceNode parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ResourceNode parseFrom(e eVar) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContents(int i, NodeContent nodeContent) {
            nodeContent.getClass();
            ensureContentsIsMutable();
            this.contents_.add(i, nodeContent);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static ResourceNode parseFrom(e eVar, h hVar) throws IOException {
            return (ResourceNode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContents(int i, NodeContent nodeContent) {
            nodeContent.getClass();
            ensureContentsIsMutable();
            this.contents_.set(i, nodeContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContents(NodeContent nodeContent) {
            nodeContent.getClass();
            ensureContentsIsMutable();
            this.contents_.add(nodeContent);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addContents(int i, NodeContent.Builder builder) {
            ensureContentsIsMutable();
            this.contents_.add(i, (NodeContent) builder.build());
        }
    }

    public static final class ResourcePage extends GeneratedMessageLite<ResourcePage, Builder> implements ResourcePageOrBuilder {
        private static final ResourcePage DEFAULT_INSTANCE;
        public static final int INDEX_FIELD_NUMBER = 1;
        public static final int NODES_FIELD_NUMBER = 2;
        private static volatile i860<ResourcePage> PARSER;
        private int bitField0_;
        private int index_;
        private l.h<ResourceNode> nodes_ = GeneratedMessageLite.emptyProtobufList();

        static {
            ResourcePage resourcePage = new ResourcePage();
            DEFAULT_INSTANCE = resourcePage;
            resourcePage.makeImmutable();
        }

        private ResourcePage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNodes(Iterable<? extends ResourceNode> iterable) {
            ensureNodesIsMutable();
            a.addAll(iterable, this.nodes_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(ResourceNode.Builder builder) {
            ensureNodesIsMutable();
            this.nodes_.add((ResourceNode) builder.build());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndex() {
            this.index_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNodes() {
            this.nodes_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureNodesIsMutable() {
            if (this.nodes_.q()) {
                return;
            }
            this.nodes_ = GeneratedMessageLite.mutableCopy(this.nodes_);
        }

        public static ResourcePage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(ResourcePage resourcePage) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(resourcePage);
        }

        public static ResourcePage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourcePage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<ResourcePage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNodes(int i) {
            ensureNodesIsMutable();
            this.nodes_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndex(int i) {
            this.index_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodes(int i, ResourceNode.Builder builder) {
            ensureNodesIsMutable();
            this.nodes_.set(i, (ResourceNode) builder.build());
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResourcePage();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    this.nodes_.n();
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.g gVar = (GeneratedMessageLite.h) obj;
                    ResourcePage resourcePage = (ResourcePage) obj2;
                    int i = this.index_;
                    boolean z2 = i != 0;
                    int i2 = resourcePage.index_;
                    this.index_ = gVar.e(z2, i, i2 != 0, i2);
                    this.nodes_ = gVar.g(this.nodes_, resourcePage.nodes_);
                    if (gVar == GeneratedMessageLite.g.INSTANCE) {
                        this.bitField0_ |= resourcePage.bitField0_;
                    }
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar = (h) obj2;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 8) {
                                    this.index_ = eVar.u();
                                } else if (iM == 18) {
                                    if (!this.nodes_.q()) {
                                        this.nodes_ = GeneratedMessageLite.mutableCopy(this.nodes_);
                                    }
                                    this.nodes_.add(eVar.w(ResourceNode.parser(), hVar));
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (ResourcePage.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
        public ResourceNode getNodes(int i) {
            return (ResourceNode) this.nodes_.get(i);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
        public int getNodesCount() {
            return this.nodes_.size();
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
        public List<ResourceNode> getNodesList() {
            return this.nodes_;
        }

        public ResourceNodeOrBuilder getNodesOrBuilder(int i) {
            return (ResourceNodeOrBuilder) this.nodes_.get(i);
        }

        public List<? extends ResourceNodeOrBuilder> getNodesOrBuilderList() {
            return this.nodes_;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.index_;
            int iT = i2 != 0 ? CodedOutputStream.t(1, i2) : 0;
            for (int i3 = 0; i3 < this.nodes_.size(); i3++) {
                iT += CodedOutputStream.C(2, (q) this.nodes_.get(i3));
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iT;
            return iT;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i = this.index_;
            if (i != 0) {
                codedOutputStream.s0(1, i);
            }
            for (int i2 = 0; i2 < this.nodes_.size(); i2++) {
                codedOutputStream.w0(2, (q) this.nodes_.get(i2));
            }
        }

        public static ResourcePage parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ResourcePage parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        public static final class Builder extends GeneratedMessageLite.b<ResourcePage, Builder> implements ResourcePageOrBuilder {
            private Builder() {
                super(ResourcePage.DEFAULT_INSTANCE);
            }

            public Builder addAllNodes(Iterable<? extends ResourceNode> iterable) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).addAllNodes(iterable);
                return this;
            }

            public Builder addNodes(ResourceNode resourceNode) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).addNodes(resourceNode);
                return this;
            }

            public Builder clearIndex() {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).clearIndex();
                return this;
            }

            public Builder clearNodes() {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).clearNodes();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
            public int getIndex() {
                return ((ResourcePage) ((GeneratedMessageLite.b) this).instance).getIndex();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
            public ResourceNode getNodes(int i) {
                return ((ResourcePage) ((GeneratedMessageLite.b) this).instance).getNodes(i);
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
            public int getNodesCount() {
                return ((ResourcePage) ((GeneratedMessageLite.b) this).instance).getNodesCount();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.ResourcePageOrBuilder
            public List<ResourceNode> getNodesList() {
                return Collections.unmodifiableList(((ResourcePage) ((GeneratedMessageLite.b) this).instance).getNodesList());
            }

            public Builder removeNodes(int i) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).removeNodes(i);
                return this;
            }

            public Builder setIndex(int i) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).setIndex(i);
                return this;
            }

            public Builder setNodes(int i, ResourceNode resourceNode) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).setNodes(i, resourceNode);
                return this;
            }

            public Builder addNodes(int i, ResourceNode resourceNode) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).addNodes(i, resourceNode);
                return this;
            }

            public Builder setNodes(int i, ResourceNode.Builder builder) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).setNodes(i, builder);
                return this;
            }

            public Builder addNodes(ResourceNode.Builder builder) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).addNodes(builder);
                return this;
            }

            public Builder addNodes(int i, ResourceNode.Builder builder) {
                copyOnWrite();
                ((ResourcePage) ((GeneratedMessageLite.b) this).instance).addNodes(i, builder);
                return this;
            }
        }

        public static ResourcePage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResourcePage parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static ResourcePage parseFrom(InputStream inputStream) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourcePage parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static ResourcePage parseFrom(e eVar) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(int i, ResourceNode resourceNode) {
            resourceNode.getClass();
            ensureNodesIsMutable();
            this.nodes_.add(i, resourceNode);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static ResourcePage parseFrom(e eVar, h hVar) throws IOException {
            return (ResourcePage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNodes(int i, ResourceNode resourceNode) {
            resourceNode.getClass();
            ensureNodesIsMutable();
            this.nodes_.set(i, resourceNode);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(ResourceNode resourceNode) {
            resourceNode.getClass();
            ensureNodesIsMutable();
            this.nodes_.add(resourceNode);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNodes(int i, ResourceNode.Builder builder) {
            ensureNodesIsMutable();
            this.nodes_.add(i, (ResourceNode) builder.build());
        }
    }

    public static final class Web extends GeneratedMessageLite<Web, Builder> implements WebOrBuilder {
        private static final Web DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 3;
        private static volatile i860<Web> PARSER = null;
        public static final int URL_FIELD_NUMBER = 1;
        public static final int WIDTH_FIELD_NUMBER = 2;
        private Layout height_;
        private String url_ = "";
        private Layout width_;

        static {
            Web web = new Web();
            DEFAULT_INSTANCE = web;
            web.makeImmutable();
        }

        private Web() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = null;
        }

        public static Web getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeHeight(Layout layout) {
            Layout layout2 = this.height_;
            if (layout2 == null || layout2 == Layout.getDefaultInstance()) {
                this.height_ = layout;
            } else {
                this.height_ = (Layout) ((Layout.Builder) Layout.newBuilder(this.height_).mergeFrom(layout)).buildPartial();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeWidth(Layout layout) {
            Layout layout2 = this.width_;
            if (layout2 == null || layout2 == Layout.getDefaultInstance()) {
                this.width_ = layout;
            } else {
                this.width_ = (Layout) ((Layout.Builder) Layout.newBuilder(this.width_).mergeFrom(layout)).buildPartial();
            }
        }

        public static Builder newBuilder(Web web) {
            return (Builder) ((Builder) DEFAULT_INSTANCE.toBuilder()).mergeFrom(web);
        }

        public static Web parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Web) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Web parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static i860<Web> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(Layout.Builder builder) {
            this.height_ = (Layout) builder.build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            byteString.getClass();
            a.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(Layout.Builder builder) {
            this.width_ = (Layout) builder.build();
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (C04581.f1695xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Web();
                case 2:
                    return DEFAULT_INSTANCE;
                case 3:
                    return null;
                case 4:
                    return new Builder();
                case 5:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Web web = (Web) obj2;
                    this.url_ = hVar.f(!this.url_.isEmpty(), this.url_, true ^ web.url_.isEmpty(), web.url_);
                    this.width_ = hVar.o(this.width_, web.width_);
                    this.height_ = hVar.o(this.height_, web.height_);
                    GeneratedMessageLite.g gVar = GeneratedMessageLite.g.INSTANCE;
                    return this;
                case 6:
                    e eVar = (e) obj;
                    h hVar2 = (h) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int iM = eVar.M();
                            if (iM != 0) {
                                if (iM == 10) {
                                    this.url_ = eVar.L();
                                } else if (iM == 18) {
                                    Layout layout = this.width_;
                                    Layout.Builder builder = layout != null ? (Layout.Builder) layout.toBuilder() : null;
                                    Layout layoutW = eVar.w(Layout.parser(), hVar2);
                                    this.width_ = layoutW;
                                    if (builder != null) {
                                        builder.mergeFrom(layoutW);
                                        this.width_ = (Layout) builder.buildPartial();
                                    }
                                } else if (iM == 26) {
                                    Layout layout2 = this.height_;
                                    Layout.Builder builder2 = layout2 != null ? (Layout.Builder) layout2.toBuilder() : null;
                                    Layout layoutW2 = eVar.w(Layout.parser(), hVar2);
                                    this.height_ = layoutW2;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(layoutW2);
                                        this.height_ = (Layout) builder2.buildPartial();
                                    }
                                } else if (!eVar.R(iM)) {
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            aag0.a(new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this));
                            return null;
                        } catch (InvalidProtocolBufferException e2) {
                            aag0.a(e2.setUnfinishedMessage(this));
                            return null;
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    if (PARSER == null) {
                        synchronized (Web.class) {
                            try {
                                if (PARSER == null) {
                                    PARSER = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return PARSER;
                default:
                    bz00.a();
                    return null;
            }
            return DEFAULT_INSTANCE;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public Layout getHeight() {
            Layout layout = this.height_;
            return layout == null ? Layout.getDefaultInstance() : layout;
        }

        public int getSerializedSize() {
            int i = ((GeneratedMessageLite) this).memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iK = !this.url_.isEmpty() ? CodedOutputStream.K(1, getUrl()) : 0;
            if (this.width_ != null) {
                iK += CodedOutputStream.C(2, getWidth());
            }
            if (this.height_ != null) {
                iK += CodedOutputStream.C(3, getHeight());
            }
            ((GeneratedMessageLite) this).memoizedSerializedSize = iK;
            return iK;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public Layout getWidth() {
            Layout layout = this.width_;
            return layout == null ? Layout.getDefaultInstance() : layout;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public boolean hasHeight() {
            return this.height_ != null;
        }

        @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
        public boolean hasWidth() {
            return this.width_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.url_.isEmpty()) {
                codedOutputStream.D0(1, getUrl());
            }
            if (this.width_ != null) {
                codedOutputStream.w0(2, getWidth());
            }
            if (this.height_ != null) {
                codedOutputStream.w0(3, getHeight());
            }
        }

        public static Web parseDelimitedFrom(InputStream inputStream, h hVar) throws IOException {
            return (Web) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Web parseFrom(ByteString byteString, h hVar) throws InvalidProtocolBufferException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(Layout layout) {
            layout.getClass();
            this.height_ = layout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(Layout layout) {
            layout.getClass();
            this.width_ = layout;
        }

        public static final class Builder extends GeneratedMessageLite.b<Web, Builder> implements WebOrBuilder {
            private Builder() {
                super(Web.DEFAULT_INSTANCE);
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).clearHeight();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).clearUrl();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).clearWidth();
                return this;
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public Layout getHeight() {
                return ((Web) ((GeneratedMessageLite.b) this).instance).getHeight();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public String getUrl() {
                return ((Web) ((GeneratedMessageLite.b) this).instance).getUrl();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public ByteString getUrlBytes() {
                return ((Web) ((GeneratedMessageLite.b) this).instance).getUrlBytes();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public Layout getWidth() {
                return ((Web) ((GeneratedMessageLite.b) this).instance).getWidth();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public boolean hasHeight() {
                return ((Web) ((GeneratedMessageLite.b) this).instance).hasHeight();
            }

            @Override // com.p1.mobile.longlink.msg.project.LongLinkOmsDialogInfo.WebOrBuilder
            public boolean hasWidth() {
                return ((Web) ((GeneratedMessageLite.b) this).instance).hasWidth();
            }

            public Builder mergeHeight(Layout layout) {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).mergeHeight(layout);
                return this;
            }

            public Builder mergeWidth(Layout layout) {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).mergeWidth(layout);
                return this;
            }

            public Builder setHeight(Layout layout) {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).setHeight(layout);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).setUrlBytes(byteString);
                return this;
            }

            public Builder setWidth(Layout layout) {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).setWidth(layout);
                return this;
            }

            public Builder setHeight(Layout.Builder builder) {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).setHeight(builder);
                return this;
            }

            public Builder setWidth(Layout.Builder builder) {
                copyOnWrite();
                ((Web) ((GeneratedMessageLite.b) this).instance).setWidth(builder);
                return this;
            }
        }

        public static Web parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Web parseFrom(byte[] bArr, h hVar) throws InvalidProtocolBufferException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, hVar);
        }

        public static Web parseFrom(InputStream inputStream) throws IOException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Web parseFrom(InputStream inputStream, h hVar) throws IOException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, hVar);
        }

        public static Web parseFrom(e eVar) throws IOException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.toBuilder();
        }

        public static Web parseFrom(e eVar, h hVar) throws IOException {
            return (Web) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eVar, hVar);
        }
    }
}
