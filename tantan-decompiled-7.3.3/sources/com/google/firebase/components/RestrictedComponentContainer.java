package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
public final class RestrictedComponentContainer implements ComponentContainer {
    private final Set<Qualified<?>> allowedDeferredInterfaces;
    private final Set<Qualified<?>> allowedDirectInterfaces;
    private final Set<Qualified<?>> allowedProviderInterfaces;
    private final Set<Class<?>> allowedPublishedEvents;
    private final Set<Qualified<?>> allowedSetDirectInterfaces;
    private final Set<Qualified<?>> allowedSetProviderInterfaces;
    private final ComponentContainer delegateContainer;

    public static class RestrictedPublisher implements Publisher {
        private final Set<Class<?>> allowedPublishedEvents;
        private final Publisher delegate;

        public RestrictedPublisher(Set<Class<?>> set, Publisher publisher) {
            this.allowedPublishedEvents = set;
            this.delegate = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public void publish(Event<?> event) {
            if (!this.allowedPublishedEvents.contains(event.getType())) {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event));
            }
            this.delegate.publish(event);
        }
    }

    public RestrictedComponentContainer(Component<?> component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet4.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isDeferred()) {
                hashSet3.add(dependency.getInterface());
            } else if (dependency.isSet()) {
                hashSet5.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Qualified.unqualified(Publisher.class));
        }
        this.allowedDirectInterfaces = Collections.unmodifiableSet(hashSet);
        this.allowedProviderInterfaces = Collections.unmodifiableSet(hashSet2);
        this.allowedDeferredInterfaces = Collections.unmodifiableSet(hashSet3);
        this.allowedSetDirectInterfaces = Collections.unmodifiableSet(hashSet4);
        this.allowedSetProviderInterfaces = Collections.unmodifiableSet(hashSet5);
        this.allowedPublishedEvents = component.getPublishedEvents();
        this.delegateContainer = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Class<T> cls) {
        if (!this.allowedDirectInterfaces.contains(Qualified.unqualified(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.delegateContainer.get(cls);
        return !cls.equals(Publisher.class) ? t : (T) new RestrictedPublisher(this.allowedPublishedEvents, (Publisher) t);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        if (this.allowedDeferredInterfaces.contains(qualified)) {
            return this.delegateContainer.getDeferred(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> getProvider(Qualified<T> qualified) {
        if (this.allowedProviderInterfaces.contains(qualified)) {
            return this.delegateContainer.getProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Set<T> setOf(Qualified<T> qualified) {
        if (this.allowedSetDirectInterfaces.contains(qualified)) {
            return this.delegateContainer.setOf(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        if (this.allowedSetProviderInterfaces.contains(qualified)) {
            return this.delegateContainer.setOfProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Class<T> cls) {
        return getDeferred(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<T> getProvider(Class<T> cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        return setOfProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> T get(Qualified<T> qualified) {
        if (this.allowedDirectInterfaces.contains(qualified)) {
            return (T) this.delegateContainer.get(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }
}
