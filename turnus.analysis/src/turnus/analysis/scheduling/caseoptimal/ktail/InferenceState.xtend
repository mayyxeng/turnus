package turnus.analysis.scheduling.caseoptimal.ktail

import java.util.LinkedHashSet
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors class InferenceState {

	final int id;
	LinkedHashSet<Transition> incomings = new LinkedHashSet;
	LinkedHashSet<Transition> outgoings = new LinkedHashSet;
	LinkedHashSet<Prefix> prefixes = new LinkedHashSet;

	new(int id) {
		this.id = id;
	}

	override int hashCode() {
		return id;
	}

	override boolean equals(Object o) {
		if (o instanceof InferenceState && (o as InferenceState).id == id) {
			return true;
		} else {
			return false;
		}
	}

}
