logLevel := Level.Debug

// disable recompile all which causes full recompile which
// makes it more difficult to test dependency tracking
incOptions ~= { _.withRecompileAllFraction(1.0) }
